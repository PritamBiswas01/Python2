pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                echo "Now Building Artifacts...."
            }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    archiveArtifacts artifacts: '**/*.py'
                }
            }
        }
 
        Stage('Create Tomcat Docker Image'){
            steps {
                sh "docker build . -t pythonsamplewebapp:${env.BUILD_ID}"
            }
        }
 
    }
}
