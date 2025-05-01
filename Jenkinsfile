pipeline {
    agent any

    tools {
        maven 'apache-maven'   // Name must match your Jenkins Maven tool name
        jdk 'Java 17'          // Name must match your Jenkins JDK configuration
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/AnnaKuruvilla/Selenium-Prj.git',
                    branch: 'master',
                    credentialsId: 'github-token'  // Replace with your Jenkins GitHub credentials ID
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Publish Extent Report') {
            steps {
                publishHTML([
                    reportName: 'Extent Report',
                    reportDir: 'target/extent-reports', // Adjust if spark.html is located elsewhere
                    reportFiles: 'spark.html',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }
    }

    post {
        always {
            echo 'Cleaning up...'
            deleteDir() // optional cleanup
        }
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed. Check test reports and logs.'
        }
    }
}
