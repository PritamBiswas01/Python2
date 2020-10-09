job('job_5 via dsl-plugin') {
    steps {
        shell(('echo Hello how are u'))
    }
    steps {
        shell('echo Hello World!')
    }
    steps {
	python {
		command('python3 python_1.py')
	}
   }    
   publishers {
        archiveArtifacts('**/*.py')
    }
}
