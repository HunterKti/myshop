FROM openjdk:8-jre

MAINTAINER Hunter

RUN mkdir /app

COPY app.jar /app/app.jar

CMD java -jar /app/app.jar --spring.profiles.active=prod

EXPOSE 8888