import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.*

plugins {
	id("com.google.protobuf") version "0.8.18"
	id("org.springframework.boot") version "2.7.6"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.7.21"
	kotlin("plugin.spring") version "1.7.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
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
	testImplementation("org.junit.jupiter:junit-jupiter")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.0")
	testImplementation("com.linecorp.armeria:armeria-junit5")
	testImplementation("org.awaitility:awaitility:4.2.0")

	/**
	 * grpc
	 */
	implementation("io.grpc:grpc-protobuf:1.50.2")
	implementation("io.grpc:grpc-stub:1.50.2")
	compileOnly("jakarta.annotation:jakarta.annotation-api:2.1.0") // Java 9+ compatibility - Do NOT update to 2.0.0

	// https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api
	implementation("javax.annotation:javax.annotation-api:1.3.2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks {
	val test by getting(Test::class) {
		useJUnitPlatform()
		testLogging {
			events("passed", "skipped", "failed")
		}
	}
}

protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:3.19.1"
	}
	generatedFilesBaseDir = "${projectDir}/src/main/generated"
	delete(generatedFilesBaseDir)
	plugins {
		id("grpc") {
			artifact = "io.grpc:protoc-gen-grpc-java:1.50.2"
		}
	}
	generateProtoTasks {
		ofSourceSet("main").forEach {
			it.plugins {
				// Apply the "grpc" plugin whose spec is defined above, without
				// options. Note the braces cannot be omitted, otherwise the
				// plugin will not be added. This is because of the implicit way
				// NamedDomainObjectContainer binds the methods.
				id("grpc") { }
			}
		}
	}
}
