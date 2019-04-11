FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY target/dockerdemo-0.0.1-SNAPSHOT.jar /tmp/app.jar
CMD java -jar /tmp/app.jar