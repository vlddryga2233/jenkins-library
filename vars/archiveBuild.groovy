def call(){
    sh 'sudo zip target/${GIT_BRANCH}-demo-app-${OWNER}-${BUILD_NUMBER}.zip target/*.jar'
    archiveArtifacts artifacts: 'target/*.zip', fingerprint: true
    echo 'Archived successful'
}