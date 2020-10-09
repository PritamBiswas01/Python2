job('job_4 via dsl-plugin') {
    scm {
        git('https://github.com/pritambiswas01/Python2', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        shell(readFileFromWorkspace('python_1.py'))
    }
    publishers {
        archiveArtifacts('**/*.py')
    }
}
