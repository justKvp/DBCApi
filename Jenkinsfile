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
                    sh("docker run -i --rm -p 8080:8080 quarkus/${packageName}")
                }
            }
        }
    }
}