def call(List servers){  

 servers.eachWithIndex { val, idx -> parallel ($idx : sh "ping  ${val} -c 5" )}
    
}