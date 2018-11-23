pipeline {
   agent any 
   def mvnHome
   stage('Preparation') { 
      git 'https://github.com/talhakhannnnn/jenkins-practice-repo.git'
      
      mvnHome = tool 'Apache Maven 3.6.0'
   }
   stage('Build') {
      // Run the maven build
      //if (isUnix()) {
         //sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      //} else {
         //bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      //}
       bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
   }
}
