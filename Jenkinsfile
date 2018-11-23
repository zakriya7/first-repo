pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git url: 'https://github.com/talhakhannnnn/jenkins-practice-repo.git'
                echo 'Pulling from git'
            }
        }
        stage('Build') {
            steps {
                echo 'building..'
                sh 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
