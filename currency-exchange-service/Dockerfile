FROM openjdk:11
LABEL maintainer="janadarakm"
EXPOSE 8000
ADD target/currency-exchange.jar currency-exchange-docker.jar
ENTRYPOINT ["java","-jar","/currency-exchange-docker.jar"]