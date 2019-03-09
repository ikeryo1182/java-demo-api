FROM openjdk:8
ARG VERSIONS="1.0.0"
COPY build/libs/demo-$VERSIONS.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=production", "/app.jar"]