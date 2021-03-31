pipeline {
    environment {
        //registry = 'https://hub.docker.com/repository/docker/tobekm/project-javaverktyg'
        //registryCredential = 'docker-hub'
        //dockerImage = ''
        DOCKER_CERT_PATH = credentials('id-for-a-docker-cred')
    }
    agent any

    tools {
        maven 'maven'
        'org.jenkinsci.plugins.docker.commons.tools.DockerTool' '18.09'
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
                sh 'docker version'
            }
        }
    }
}
