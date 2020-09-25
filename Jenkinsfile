pipeline{
    agent any
     stages{
         stage("Git Checkout") {
             steps{
                 echo "Checking out the source code"
                 git 'https://github.com/Khujamov/docker-jenkins-spring.git'
             }
         }
     }
}
