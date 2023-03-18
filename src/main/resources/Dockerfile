#FROM openjdk:17-alpine
MAINTAINER hjjeong <jeongdalma@gmail.com>

EXPOSE 8081

VOLUME /tmp
COPY build/libs/armeria-server-0.0.1-SNAPSHOT.jar /app/armeria-server-0.0.1-SNAPSHOT.jar
#ADD startup.sh /usr/local/bin/startup.sh
#RUN chmod u+x /usr/local/bin/startup.sh
WORKDIR /app

#CMD /usr/local/bin/startup.sh
CMD java -jar /app/armeria-server-0.0.1-SNAPSHOT.jar
