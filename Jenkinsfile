#!groovy

pipeline{
   agent linux
  stages{
    stage('Maven Install'){
     
      steps{
        sh 'mvn clean install'
      }
    }
  }
}
