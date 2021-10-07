def call(List servers){  
    parallel(
    a: {
        echo "PING ${servers.get(0)}"
        sh "ping  ${servers.get(0)} -c 5"
    },
    b: {
        echo "PING ${servers.get(1)}"
        sh "ping ${servers.get(1)} -c 5"
    },
    c: {
        echo "PING ${servers.get(2)}"
        sh "ping ${servers.get(2)} -c 5"
    }) 
}