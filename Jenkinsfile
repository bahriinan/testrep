pipeline {
    agent any
    stages{
        stage('Compile Stage'){
            withMaven(maven : 'maven_3_5_0' ){
                sh 'mvn clean compile'
            }
        }
        stage('Test Stage'){
            withMaven(maven : 'maven_3_5_0' ){
                sh 'mvn test'
            }
        }
        stage('Deployment Stage'){
            withMaven(maven : 'maven_3_5_0' ){
                sh 'mvn deploy'
                
            }
        }
    }
    
}
