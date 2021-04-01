pipeline {
    environment {
        registry = 'tobekm/project-javaverktyg'
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
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Build docker image') {
            steps {
                script {
                    dockerImage = docker.build registry + ':1.2'
                }
            }
        }

        stage('Push to docker hub') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                    dockerImage.push()
                    }
                }
            }
        }
    }
}
