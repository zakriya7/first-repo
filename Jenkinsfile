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
            sshagent (['25f5ce22-f3b2-465d-b4fe-acc826416d76']){
               sh 'scp -o StrictHostKeyChecking=no target/*.war ec2-user@52.87.161.28:/home/'
            }
         }
      }
      }
   }
