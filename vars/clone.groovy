def call(String GitUrl, String GitBranch) {
  echo "This is cloning stage beginning"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "Cloning done."
}
