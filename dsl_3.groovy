job('job_6') {
    scm {
        git('https://github.com/pritambiswas01/Python2.git, 'master')
    }
    triggers {
        scm('* * * * *')
    }
}
