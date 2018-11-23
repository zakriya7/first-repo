pipeline {
    agent {
        docker {
            image 'ubuntu'
            image 'maven:3-alpine'
        }
    }
    stages{
        stage('Preparation'){
            steps{
                git 'https://github.com/Kamran-saeed/javasamplecode.git'
            }
        }
    
    
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    
    
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }

    }
}