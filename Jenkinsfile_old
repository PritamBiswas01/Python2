pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                		build job: 'job_1'
				}
            }
            stage('Build') {
                  steps {
						sh 'job.sh
				}

            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
                  }
            }
            stage('Deploy Production') {
                  steps {
						build job: 'job_3'
				}
			}
      }
}
