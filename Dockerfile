FROM openjdk:17-jdk-alpine
COPY target/spring-boot-docker.jar newapp.jar
ENTRYPOINT [ "java","-jar","/newapp.jar" ]