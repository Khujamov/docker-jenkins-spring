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
                 sh "mv target/*.jar target/myapp.jar"
             }
         }
         stage("Deploy") {
             steps{
                 echo "Deploying the project"
                 sshagent (credentials: ['deploy-dev']) {
                    sh """
                        // Copying .jar to inside tomcat 
                        scp -o StrictHostKeyChecking=no target/myapp.jar HOST:/opt/tomcat/webapps/
                        
                        // Restarting Tomcat
                        ssh HOST /opt/tomcat/bin/shutdown.sh
                        ssh HOST /opt/tomcat/bin/startup.sh
                       """
                 }
             }
         }
     }
}
