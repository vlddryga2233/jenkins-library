def call(List servers){  
    for(int i in servers.size()){
        parallel( 
        i: {
    
             sh "ping  ${servers.get(i)} -c 5"
        }
        )
    } 
}