node {
   def mvnHome
   stage('Preparation') { 
      git 'https://github.com/talhakhannnnn/jenkins-practice-repo.git'
      
      mvnHome = tool 'Apache Maven 3.6.0'
   }
   stage('Build') {
      echo 'Building'
      bat(/"${mvnHome}\bin\mvn" clean install/)
   }
   
}
