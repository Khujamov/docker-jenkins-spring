pipeline{
    agent any
    environment {
        MAVEN_HOME = tool('Maven')
    }
     stages{
         stage("Git Checkout") {
             steps{
                 echo "Checking out the source code"
                 echo "No need to explicitly pull the source code as our Pipeline script is inside the source code"
             }
         }
         stage("Build") {
             steps{
                 echo "Building the project"
                 sh "${MAVEN_HOME}/bin/mvn clean package"
             }
         }
     }
}
