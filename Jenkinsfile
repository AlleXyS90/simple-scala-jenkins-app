/* uses sbt, which i installed with homebrew. */
/* this works without requiring the 'sbt plugin'. */

pipeline {
  agent any

  stages {

    stage('Compile') {
      steps {
        echo "Compiling..."
        //   sh "/usr/local/bin/sbt compile"
        // sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/usr/local/bin/sbt compile"
        sh "sbt compile"
      }
    }

    stage('Test') {
      steps {
        echo "Testing..."
        // sh "/usr/local/bin/sbt test"
        sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/usr/local/bin/sbt test"
      }
    }

    stage('Package') {
      steps {
        echo "Packaging..."
        sh "/usr/local/bin/sbt package"
      }
    }

  }
}
