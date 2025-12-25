pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run App') {
            steps {
                sh '''
                pkill -f java-demo || true
                nohup java -jar target/java-demo-1.0.jar &
                '''
            }
        }
    }
}
