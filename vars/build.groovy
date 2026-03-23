def call(String Projectname, String Imagetag, String dockerHubUsesr){
  sh "docker build -t ${dockerHubUsesr}/${Projectname}:${Imagetag} ."
}
