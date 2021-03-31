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
        docker.withRegistry('https://hub.docker.com/repository/docker/tobekm/project-javaverktyg', 'docker-hub') {
            docker.build('project-javaverktyg').push('latest')
        }
      }
    }
  }
}
