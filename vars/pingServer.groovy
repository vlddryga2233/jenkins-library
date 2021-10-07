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
                    stage("Ping ${servers.get(0)}") {
                            steps {
                                sh "ping  ${servers.get(0)} -c 5"
                            }
                    }
                    stage("Ping ${servers.get(1)}") {
                            steps {
                                sh "ping ${servers.get(1)} -c 5"
                            }
                    }
                    stage('Ping ${server[2]}') {
                            steps {
                                sh "ping ${servers.get(2)} -c 5"
                            }
                    }
                }   
            }
        }
    }    
}