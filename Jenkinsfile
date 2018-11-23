pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
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
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}
