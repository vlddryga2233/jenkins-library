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
                    stage("Ping 1") {
                            steps {
                                sh "ping  ${servers.get(0)} -c 5"
                            }
                    }
                    stage("Ping 2") {
                            steps {
                                sh "ping ${servers.get(1)} -c 5"
                            }
                    }
                    stage('Ping 3') {
                            steps {
                                sh "ping ${servers.get(2)} -c 5"
                            }
                    }
                }   
            }
        }
    }    
}