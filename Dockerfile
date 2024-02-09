FROM openjdk:21-jdk-oracle

ARG JAR_FILE=/build/libs/project-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /project.jar

ENTRYPOINT ["java","-jar", "/project.jar"]