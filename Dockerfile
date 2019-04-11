FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY target/springBootRestService.jar /tmp/app.jar
CMD java -jar /tmp/app.jar