#!groovy

pipeline{
  agent name
  stages{
    stage('Maven Install'){
      agent{
        docker{
          image 'maven:3.5.0'
        }
      }
      steps{
        sh 'mvn clean install'
      }
    }
  }
}
