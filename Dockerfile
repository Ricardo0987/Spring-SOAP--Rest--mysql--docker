FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8181 4444
ENTRYPOINT ["java","-jar","/app.jar"]