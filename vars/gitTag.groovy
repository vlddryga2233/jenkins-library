def call(){
    withCredentials([gitUsernamePassword(credentialsId:'jenkins-github-access-token',gitToolName: 'git-tool')]){
                sh 'git tag -a v${BUILD_NUMBER} -m add-${BUILD_NUMBER}-tag'

    }
    withCredentials([sshUserPrivateKey(keyFileVariable: 'KEY_FILE', credentialsId: 'jenkins-github-key')]){
                sh 'git push origin v${BUILD_NUMBER}'
                echo 'tags added'
    }
}
