FROM openjdk:11.0.6-slim

ARG JAR_FILE=target/docker-jenkins-app.jar

COPY ${JAR_FILE} app.jar

CMD ["java", "-jar", "app.jar"]
