pipeline {
    agent any
    tools {
        maven 'local maven'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'save file...'
                    archiveArtifacts artifacts: '**//*.war'
                }
            }
        }
        stage('deploy to staging') {
            steps {
                build job: 'deploy to staging'
            }
        }
    }
}