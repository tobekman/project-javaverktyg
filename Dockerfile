FROM adoptopenjdk:16-jre

COPY target/project-javaverktyg-1.0-SNAPSHOT-jar-with-dependencies.jar /project-javaverktyg.jar

CMD ["java", "-jar", "/project-javaverktyg.jar"]