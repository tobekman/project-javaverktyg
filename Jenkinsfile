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

    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }

    stage('Run') {
        steps {
            sh 'java -jar project-javaverktyg-1.0-SNAPSHOT.jar'
            //sh 'docker build -t tobekm/project-javaverktyg:1.0 .'
            //sh 'docker push tobekm/project-javaverktyg:1.0'
        }
    }

  }
}