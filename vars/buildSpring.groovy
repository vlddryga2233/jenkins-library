def call(){
    pipeline{
        agent {
            node {
                label "${nodeLabel}"
            }
        }
        environment{
                OWNER='Vlad-Dryha'
                STAGE='PROD'
        }
        stage('Checkout') {
                steps {
                   scmSkip(deleteBuild: true, skipPattern:'SKIP_CI')
                }
        }
        stage('Build and Test') {
                steps {
                      echo sh(script: 'env|sort', returnStdout: true)

                      echo 'Start building the project'
                      //sh 'sudo chmod 755 mvnw'
                      //sh 'sudo ./mvnw package'
                      echo 'Build is ready'
                }
        }
        post {
            success {
                echo 'success'
            }
            failure {
                echo 'fail'
            }
            always {
                echo 'done'
            }
        }
    }
}