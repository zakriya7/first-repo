pipeline{
   agent any
   stages {
      stage ('Build Stage'){
         steps{
        bat 'mvn clean install'
         }
      }

      stage ('Deploy Stage'){
         steps{
            sshagent (['25f5ce22-f3b2-465d-b4fe-acc826416d76']){
               sh 'scp -o StrictHostKeyChecking=no target/*.war ec2-user@52.71.252.239:/home/'
            }
         }
      }
      }
   }
