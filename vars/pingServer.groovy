def call(List servers){  
    for(int i in servers.size()){
        parallel({
    
             sh "ping  ${servers.get(i)} -c 5"
        }
        )
    } 
}