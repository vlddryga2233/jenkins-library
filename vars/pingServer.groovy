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
                    for(int i in servers.seze()){
                        stage("Ping ${servers.get(i)}") {
                            steps {
                                sh "ping  ${servers.get(i)} -c 5"
                            }
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