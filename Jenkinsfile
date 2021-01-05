pipeline {
    agent {
        docker {
            image 'jamesdbloom/docker-java8-maven:latest'
            args '-v /root/.m2:/root/.m2'
        }
    }
	
    stages {
	
		stage('1') {
			steps {
				script {
					sh 'rm -rf jenkins.docker.spring.react_person-database'
				}
			}
		}
	
	
        stage('2') {
            steps {
                script {
					sh 'git clone https://github.com/willstopher817/jenkins.docker.spring.react_person-database.git'
                }
            }
        }
	
        stage('3') {
            steps {
                script {
                    dir('$PWD/jenkins.docker.spring.react_person-database') {
						sh 'mvn spring-boot:run'
                    }
                }
            }
        }
    }
}
