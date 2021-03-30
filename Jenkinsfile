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

    stage('Push to Docker') {
        steps {
            sh 'sudo docker build -t tobekm/project-javaverktyg:1.0 .'
            sh 'sudo docker push tobekm/project-javaverktyg:1.0'
        }
    }

  }
}