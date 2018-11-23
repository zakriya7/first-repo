node {
   def mvnHome
   stage('Preparation') { 
      git 'https://github.com/talhakhannnnn/jenkins-practice-repo.git'
      
      mvnHome = tool 'Apache'
   }
   stage('Build') {
      echo 'Building'
      bat(/"${mvnHome}\bin\mvn" clean install/)
   }
   
}
