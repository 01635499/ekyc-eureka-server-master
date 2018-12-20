pipeline {
   agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
  }
  
  stages {
    stage('Init') {
      steps {
        echo 'Hello World'
        
           
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -B -U -DskipTests clean package'
      }
    }
    stage('Test') {
      steps {
        echo '222'
        sh 'mvn test'
        
      }
      
    }
    stage('Deploy') {
      steps {
        echo 'Deploying'
        sh './jenkins/scripts/deliver.sh'
        
      }
    }
  }
}
