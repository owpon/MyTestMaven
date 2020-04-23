pipeline {
    agent any
    tools {
        maven 'local maven'
    }
    stages {
        stage('Init') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'save file...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
    }
}