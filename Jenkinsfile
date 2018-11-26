pipeline{
   agent any
   tools{
      maven 'Apache-Maven'
   }
   stages {
      stage ('Build Stage'){
         steps{
        sh 'mvn clean install'
         }
      }

      stage ('Deploy Stage'){
         steps{
            sshagent (['e7e3412a-b927-4068-a782-fd8367ff0c17']){
               sh 'scp -o StrictHostKeyChecking=no target/*.war ec2-user@52.87.161.28:/home/'
            }
         }
      }
      }
   }
