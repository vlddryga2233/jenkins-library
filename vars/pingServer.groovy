def call(List servers){  
            for(int i in server.each)
            {
                //parallel(
                //    i : {echo "ping ${servers.get(i)}"    
                //sh "ping  ${servers.get(i)} -c 5"}
                //)
                println(i)    
            } 
}