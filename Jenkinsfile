/* uses sbt, which i installed with homebrew. */
/* this works without requiring the 'sbt plugin'. */

pipeline {
  agent any

  stages {

    stage('Compile') {
      steps {
        echo "Compiling..."
        //   sh "/usr/local/bin/sbt compile"
         bat "${tool name: 'sbt 0.13.15', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt compile"
        // sh "sbt compile"
      }
    }

    stage('Test') {
      steps {
        echo "Testing..."
        // sh "/usr/local/bin/sbt test"
         bat "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder_SbtInstallation'}/sbt_v0.13.15/bin/sbt-launch.jar compile"
      }
    }

    stage('Package') {
      steps {
        echo "Packaging..."
        bat "/usr/local/bin/sbt package"
      }
    }

  }
}
