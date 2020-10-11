pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        scm {
							git("https://github.com/pritambiswas01/Python2.git", 'master')
						}
						triggers {
							scm('* * * * *')
						}
						echo 'Hi, this is Anshul from LevelUp360'
                        echo 'We are Starting the Testing'
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
