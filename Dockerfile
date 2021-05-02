# Install prerequisites
FROM ubuntu:18.04

RUN apt-get update && apt-get install -y curl &&  apt-get install -y openjdk-8-jdk && apt-get install -y maven

ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/

RUN mkdir /app






WORKDIR /app





ENTRYPOINT ["java","-jar","/app/target/mareo-envios-0.0.1-SNAPSHOT.jar"]
