def Call(List servers){
    parallel {
        stage('Ping ${server[0]}') {
            steps {
                sh 'ping ${server[0]} -c 5'
            }
        }
        stage('Ping ${server[1]}') {
            steps {
                sh 'ping ${server[1]} -c 5'
            }
        }
        stage('Ping ${server[2]}') {
            steps {
                sh 'ping ${server[2]} -c 5'
            }
        }
    }
}