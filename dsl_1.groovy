job('job_4 via dsl-plugin') {
    scm {
        github('https://github.com/pritambiswas01/Python2', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        /bin/sh
		python3 /var/lib/jenkins/workspace/Job_1/python_1.py
    }
    publishers {
        archiveArtifacts('**/*.py')
    }
}
