FROM maven:3.6.3-openjdk-8

COPY target/project-javaverktyg-1.0-SNAPSHOT.jar /project-javaverktyg.jar

CMD ["java", "-jar", "/project-javaverktyg.jar"]