pipeline{
   agent any

   stages {
      stage ('Compile Stage'){
         steps{
            maven (name : 'Apache Maven 3.6.0'){
               bat "mvn clean compile"
            }
         }
      }
   }
}