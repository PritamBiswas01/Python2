job('job_4 via dsl-plugin') {
    steps {
        shell(readFileFromWorkspace('python_1.py'))
    }
    publishers {
        archiveArtifacts('**/*.py')
    }
}
