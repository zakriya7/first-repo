pipeline{
   agent any
   stages {
      stage ('Build Stage'){
         steps{
        sh 'mvn -Dmaven.test.failure.ignore=true install'
         }
      }

      stage ('Deploy Stage'){
         steps{
            sshagent (['9731c933-53e1-4808-bd81-fe012c7346b7']){
               sh 'scp -o StrictHostKeyChecking=no target/*.war ec2-user@52.71.252.239:/home/'
            }
         }
      }
      }
   }
