def call(List servers){  
            for(int i in servers.size())
            {
                echo "ping ${servers.get(i)}"    
                sh "ping  ${servers.get(i)} -c 5"
            } 
}