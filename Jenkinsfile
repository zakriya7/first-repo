pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    tools{
        maven 'Apache'
        jdk 'JDK 9'
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
