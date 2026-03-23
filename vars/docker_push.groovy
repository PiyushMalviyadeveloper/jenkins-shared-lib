def call(String project, String Imagetag, String dockerhubuser){
   withCredentials([usernamePassword(
                    credentialsId: "dockerHubCred",
                    usernameVariable: "dockerHubUser",
                    passwordVariable: "dockerHubPass"
                )]) {
                    sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
                   }
   sh 'docker push ${dockerhubuser}/${project}:${Imagetag}'
}
