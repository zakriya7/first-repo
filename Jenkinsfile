pipeline{
   agent any

   stages {
      stage ('Compile Stage'){
         steps{
            withMaven(maven : 'Apache Maven 3.6.0'){
               bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
         }
      }
   }
}