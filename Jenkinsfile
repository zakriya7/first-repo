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
                echo 'Building..'
                sh 'mvn install'
                sh 'mvn clean'
                sh 'mvn compile'
                //withMaven(maven : 'maven_3_6_0'){
                 //   sh 'mvn clean compile'
               // }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                //withMaven(maven : 'maven_3_6_0'){
                    sh 'mvn test'
               // }
            }
        }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying....'
        //     }
        // }
    }
}
