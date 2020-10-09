job('job_5 via dsl-plugin') {
    scm {
        git("https://github.com/pritambiswas01/Python2.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        shell(('echo Hello how are u'))
    }
    steps {
        shell('echo Hello World!')
    }
    steps {
	shell(readFileFromWorkspace('job.sh'))
	}
   publishers {
        archiveArtifacts('**/*.py')
    }
}
