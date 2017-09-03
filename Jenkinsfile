pipeline {
	agent any

	stages {
		stage('scm') {
			steps {
				checkout scm
			}
		}

		stage('clean') {
			steps {
				sh "./gradlew clean --refresh-dependencies"
			}
		}

		stage('compile') {
			steps {
				sh "./gradlew compileJava"
			}
		}

		stage('package') {
			steps {
				// Build docker image
				sh "./gradlew containerize -Pversion=${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
				//docker push?
			}
		}

		stage('deploy') {
			when {
				branch 'production'
			}
			steps {
				echo 'todo - deploy to production machine'
			}
		}
	}
	post {
		always {
			echo "done"
		}
		changed {
			echo 'todo - notify slack channel'

			emailext (
				subject: '$DEFAULT_SUBJECT',
				body: '$DEFAULT_CONTENT',
				recipientProviders: [[$class: 'DevelopersRecipientProvider']]
			)
		}
	}
}