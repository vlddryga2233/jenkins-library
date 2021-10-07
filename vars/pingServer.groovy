def call(List servers){  
    
        parallel(
            for(int i in servers.size())
            {
                i : {
                echo "ping ${servers.get(i)}"    
                sh "ping  ${servers.get(i)} -c 5"
                },
            } 
        )
     
}