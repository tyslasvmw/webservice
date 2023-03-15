pipeline {
    agent any

    options {
        skipDefaultCheckout true
    }
    
    stages {
        stage('Clone Repository') {
            steps {
                git branch: "main", url: "https://github.com/tyslasvmw/webservice.git"
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
                sh 'echo "build complete"'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
                sh 'echo "test complete"'
            }
        }
    }
}
