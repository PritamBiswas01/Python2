job('job_6') {
    scm {
        git(
	url: 'https://github.com/pritambiswas01/Python2.git',
	branch: 'master'
)
    }
    triggers {
        scm('* * * * *')
    }
}
