node {
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
      }
    }

  }

}
