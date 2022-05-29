FROM openjdk:11
LABEL maintainer="janadarakm"
EXPOSE 8761
ADD target/naming-server.jar naming-server-docker.jar
ENTRYPOINT ["java","-jar","/naming-server-docker.jar"]
