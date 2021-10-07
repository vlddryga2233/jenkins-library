def call(List servers){  
    parallel(
    a: {
        sh "ping  ${servers.get(0)} -c 5"
    },
    b: {
        sh "ping ${servers.get(1)} -c 5"
    },
    c: {
        sh "ping ${servers.get(2)} -c 5"
    }) 
}