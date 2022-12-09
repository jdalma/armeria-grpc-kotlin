import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.File
import java.io.FileInputStream
import java.util.*

plugins {
	id("org.springframework.boot") version "2.7.6"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.7.21"
	kotlin("plugin.spring") version "1.7.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

val prop = Properties().apply {
	load(FileInputStream(File(System.getProperty("user.home") + "/.gradle.properties")))
}

repositories {
	mavenCentral()
	maven {
		url = uri(prop.getProperty("repository.url.public"))
		isAllowInsecureProtocol = true
		credentials {
			username = prop.getProperty("repository.id") as String
			password = prop.getProperty("repository.password") as String
		}
	}
}

dependencyManagement {
	imports {
		mavenBom("io.micrometer:micrometer-bom:1.9.4")
		mavenBom("io.netty:netty-bom:4.1.82.Final")
		mavenBom("org.junit:junit-bom:5.9.1")
		mavenBom("com.linecorp.armeria:armeria-bom:1.20.3")
	}
}

dependencies {
	/**
	 * armeria
	 */
	implementation("com.linecorp.armeria:armeria-kotlin")
	implementation("com.linecorp.armeria:armeria")
	implementation("com.linecorp.armeria:armeria-spring-boot2-starter")
	implementation("com.linecorp.armeria:armeria-tomcat9")
	implementation("com.linecorp.armeria:armeria-grpc")

	/**
	 * spring
	 */
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-aop")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

	/**
	 * jvm-stub
	 */
	implementation("com.wert:jvm-stub:2022.12.07.01@jar")

	/**
	 * slf4j를 Kotlin 확장
	 */
	implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")

	/**
	 * kotlin
	 */
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")

	/**
	 * test
	 */
	testImplementation("org.assertj:assertj-core:3.23.1")
	testImplementation("org.junit.jupiter:junit-jupiter-api")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.0")
	testImplementation("com.linecorp.armeria:armeria-junit5")
	testImplementation("org.awaitility:awaitility:4.2.0")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}