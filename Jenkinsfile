pipeline{
   agent any

   stages {
      stage ('Compile Stage'){
         steps{
            maven (maven : 'Apache Maven 3.6.0'){
               bat "mvn clean compile"
            }
         }
      }
   }
}