FROM openjdk:8
LABEL maintainer="sanjaypskumar@gmail.com"
ADD target/dockerdemo-0.0.1-SNAPSHOT.jar spring-docker-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-docker-demo.jar"]