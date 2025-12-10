def UUID_DIR = UUID.randomUUID().toString()
def jenkinsBaseUrl = env.JENKINS_URL
def jobName = env.JOB_NAME
def buildNumber = env.BUILD_NUMBER
def url = "https://${jenkinsBaseUrl}/job/${jobName}/${buildNumber}/"
def packageName = ""

pipeline {

    agent any

    stages {
        stage('prepare') {
            steps {
                script {
                    sh('java -version')
                    sh('./gradlew --version')
                    packageName = sh(returnStdout: true, script: './gradlew -s --quiet properties | grep "^name: "').trim().replace("name: ", "")

                    // Сначала останавливаем контейнер, если он есть (игнорируем ошибку)
                    sh "docker stop ${packageName} || true"
                    sh "docker rm ${packageName} || true"
                }
            }
        }

        stage('build') {
            steps {
                script {
                    sh('./gradlew clean quarkusBuild -Dquarkus.package.type=native -Dquarkus.native.debug.enabled=true -Dquarkus.native.add-all-charsets=true -Dquarkus.log.level=DEBUG')
                }
            }
        }

        stage('docker build') {
            steps {
                script {
                    sh("docker build -f src/main/docker/Dockerfile.native-micro -t quarkus/${packageName} .")
                }
            }
        }

        stage('docker run') {
            steps {
                script {
                    withCredentials([
                                    string(credentialsId: 'DB_URL', variable: 'DB_URL'),
                                    string(credentialsId: 'DB_PORT', variable: 'DB_PORT'),
                                    string(credentialsId: 'DB_NAME', variable: 'DB_NAME'),
                                    string(credentialsId: 'DB_USER', variable: 'DB_USER'),
                                    string(credentialsId: 'DB_PASSWORD', variable: 'DB_PASSWORD')
                                ])
                    {
                        sh '''
                            docker run -d \
                                --name ${packageName} \
                                -p 8080:8080 \
                                -e DB_URL=$DB_URL \
                                -e DB_PORT=$DB_PORT \
                                -e DB_NAME=$DB_NAME \
                                -e DB_USER=$DB_USER \
                                -e DB_PASSWORD=${DB_PASSWORD} \
                                quarkus/${packageName}
                        ''''
                    }
                }
            }
        }
    }
}