def call(List servers){  
    parallel(
        for(int i in servers.size()){
            echo "PING ${servers.get(i)}"
        sh "ping  ${servers.get(i)} -c 5"
        }) 
}