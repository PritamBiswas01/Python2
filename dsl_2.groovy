job('job_5 via dsl-plugin') {
    steps {
        shell(('echo Hello how are u'))
    }
    steps {
        shell('echo Hello World!')
    }
    publishers {
        archiveArtifacts('**/*.py')
    }
}
