pipeline {
    agent any

    tools {
        maven 'local maven'
    }

    parameter {
        string(name: 'tomcat_dev', defaultValue: '54.236.216.8', description: 'staging server')
    }

    trigger {
        pollSCM('* * * * *')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo '開始儲存...'
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }

        stage('Deployments') {
            parallel {
                stage('Deploy to Staging') {
                    steps {
                        sh "scp -i/Users/ziv/Documents/myawsssl/tomcat.pem **/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat8/webapps"
                    }
                }
            }
        }
    }

}