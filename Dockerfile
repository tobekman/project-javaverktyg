FROM openjdk:8-jdk

COPY target/project-javaverktyg-1.0-SNAPSHOT.jar /project-javaverktyg.jar

CMD ["java", "-jar", "/project-javaverktyg.jar"]