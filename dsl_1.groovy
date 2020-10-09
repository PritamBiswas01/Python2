job('job_4 via dsl-plugin') {
    scm {
        git("https://github.com/PritamBiswas01/Python2.git", master)
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
