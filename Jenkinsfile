pipeline {
  agent any

  tools {
    maven 'maven'
  }

  stages {
    stage('Build') {
      steps {
        bat 'mvn clean compile'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }

    stage('Deploy') {
      steps {
        bat 'mvn package'
        bat 'docker build -t tobekm/project-javaverktyg:1.1 .'
        bat 'docker push tobekm/project-javaverktyg:1.1'
      }
    }
  }
}