job('job_5 via dsl-plugin') {
    scm {
        git("https://github.com/pritambiswas01/Python2.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        shell(('/bin/sh'))
		shell(readFileFromWorkspace('python_1.py'))
    }
    publishers {
        archiveArtifacts('**/*.py')
    }
}
