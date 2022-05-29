FROM openjdk:11
LABEL maintainer="janadarakm"
EXPOSE 8100
ADD target/currency-conversion.jar currency-conversion-docker.jar
ENTRYPOINT ["java","-jar","/currency-conversion-docker.jar"]