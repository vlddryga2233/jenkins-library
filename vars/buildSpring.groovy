def call(){            
  echo sh(script: 'env|sort', returnStdout: true)
  echo 'Start building the project'
  sh 'sudo chmod 755 mvnw'
  sh 'sudo ./mvnw package'
  echo 'Build is ready'            
}