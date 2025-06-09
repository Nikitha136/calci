pipeline{
    agent any
    tools{
        gradle 'GRADLE'
    }
    stages{
        stage('Checkout'){
            steps{
                git branch:'master',url:'https://github.com/Nikitha136/calci.git'
            }
        }
        stage('Build'){
            steps{
                script{
                bat './gradlew clean build'
                }
            }
        }
        stage('Test'){
            steps{
                script{
                bat './gradlew test'
                }
            }
        }
        stage('Run Application'){
            steps{
                script{
                bat 'java -jar app/build/libs/app.jar'
                }
            }
        }
    }
}
            
    
