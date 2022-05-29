FROM openjdk:11
LABEL maintainer="janadarakm"
EXPOSE 8765
ADD target/api-gateway.jar api-gateway-docker.jar
ENTRYPOINT ["java","-jar","/api-gateway-docker.jar"]