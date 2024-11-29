pipeline {
    agent any
    stages {
        stage('Clone repository') {
            steps {
                git branch: 'main', url: 'git@github.com:armeldevops/pipelinetest.git'
            }
        }
        stage('Execute Script') {
            steps {
                sh 'chmod +x message.sh'
                sh './message.sh'
            }
        }
    }
}