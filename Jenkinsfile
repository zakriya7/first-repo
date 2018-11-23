pipeline{
   agent any

   stages {
      stage ('Compile Stage'){
         steps{
            withMaven(maven : 'Apache Maven 3.6.0'){
               sh 'mvn clean compile'
            }
         }
      }
   }
}