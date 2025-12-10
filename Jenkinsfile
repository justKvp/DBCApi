def UUID_DIR = UUID.randomUUID().toString()
def jenkinsBaseUrl = env.JENKINS_URL
def jobName = env.JOB_NAME
def buildNumber = env.BUILD_NUMBER
def url = "${jenkinsBaseUrl}job/${jobName}/${buildNumber}/"

pipeline {
    agent any

    stages {
        stage('prepare') {
            steps {
                script {
                    sh('java -version')
                    sh('./gradlew --version')
                    echo "${url}"

                    // Устанавливаем переменную окружения
                    env.PACKAGE_NAME = sh(
                        returnStdout: true,
                        script: './gradlew -s --quiet properties | grep "^name: "'
                    ).trim().replace("name: ", "")
                    echo "PACKAGE_NAME = ${env.PACKAGE_NAME}"

                    // Останавливаем и удаляем старый контейнер
                    sh '''
                        docker stop "$PACKAGE_NAME" || true
                        docker rm "$PACKAGE_NAME" || true
                    '''
                }
            }
        }

        stage('build') {
            steps {
                sh './gradlew clean quarkusBuild -Dquarkus.package.type=native -Dquarkus.native.debug.enabled=true -Dquarkus.native.add-all-charsets=true -Dquarkus.log.level=DEBUG'
            }
        }

        stage('docker build') {
            steps {
                sh '''
                    docker build -f src/main/docker/Dockerfile.native-micro -t quarkus/"$PACKAGE_NAME" .
                '''
            }
        }

        stage('docker run') {
            steps {
                withCredentials([
                    string(credentialsId: 'DB_URL', variable: 'DB_URL'),
                    string(credentialsId: 'DB_PORT', variable: 'DB_PORT'),
                    string(credentialsId: 'DB_NAME', variable: 'DB_NAME'),
                    string(credentialsId: 'DB_USER', variable: 'DB_USER'),
                    string(credentialsId: 'DB_PASSWORD', variable: 'DB_PASSWORD')
                ]) {
                    sh '''
                        docker run -d \
                            --name "$PACKAGE_NAME" \
                            --network wowdb \
                            -p 8080:8080 \
                            -e DB_URL="$DB_URL" \
                            -e DB_PORT="$DB_PORT" \
                            -e DB_NAME="$DB_NAME" \
                            -e DB_USER="$DB_USER" \
                            -e DB_PASSWORD="$DB_PASSWORD" \
                            quarkus/"$PACKAGE_NAME"
                    '''
                }
            }
        }
    }
}