def call(List servers, String nodeLabel){  
    pipeline {
        agent {
            node {
                label "${nodeLabel}"
            }
        }
        stages {
            stage('Ping module'){
                parallel {
                    stage('Ping ${server[0]}') {
                            steps {
                                sh "ping  ${assert server.get(0)} -c 5"
                            }
                    }
                    stage('Ping ${server[1]}') {
                            steps {
                                sh "ping ${assert server.get(1)} -c 5"
                            }
                    }
                    stage('Ping ${server[2]}') {
                            steps {
                                sh "ping ${assert server.get(2)} -c 5"
                            }
                    }
                }   
            }
        }
    }    
}