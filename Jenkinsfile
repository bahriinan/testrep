#!groovy

pipeline{
  agent none
  stages{
    stage('Maven Install'){
      agent
      {
        docker{
          image 'maven:3.5.2'
        }
      }
      steps{
        sh 'mvn clean compile'
      }
    }
    stage('Deploy'){
      agent
      {
        docker{
          image 'maven:3.5.2'
        }
      }
      steps{
        sh 'mvn deploy'
      }
    }
  }
}
