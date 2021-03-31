pipeline {
    environment {
        registry = 'https://hub.docker.com/repository/docker/tobekm/project-javaverktyg'
        registryCredential = 'docker-hub'
        dockerImage = ''
    }
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
          }
        }

        stage('Build docker image') {
            steps {
                script {
                    dockerImage = docker.build registry + 'latest'
                    docker.withRegistry('', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
