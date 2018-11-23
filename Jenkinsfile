pipeline{
   agent any
   tools {
        maven 'Apache Maven 3.6.0'
   }
   stages {
      stage ('Compile Stage'){
         steps{
               bat "mvn clean compile"
         }
      }
   }
}