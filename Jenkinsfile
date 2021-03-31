pipeline {
  agent any

  tools {
    maven 'maven'
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Deploy') {
      steps {
        sh 'mvn package'
        sh 'java -jar project-javaverktyg-1.0-SNAPSHOT-jar-with-dependencies.jar'
        sh 'docker build -t tobekm/project-javaverktyg:1.0 .'
        sh 'docker push tobekm/project-javaverktyg:1.0'
      }
    }

    stage('Run') {
        steps {
            bat 'java -jar project-javaverktyg-1.0-SNAPSHOT-jar-with-dependencies.jar'
            bat 'docker build -t tobekm/project-javaverktyg:1.0 .'
            bat 'docker push tobekm/project-javaverktyg:1.0'
        }
    }

  }
}