/* uses sbt, which i installed with homebrew. */
/* this works without requiring the 'sbt plugin'. */

pipeline {
  agent any

  stages {

    stage('Compile') {
      steps {
        echo "Compiling..."
        bat "${tool name: 'sbt 0.13.15', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt compile"
      }
    }

    stage('Test') {
      steps {
        echo "Testing..."
        bat "${tool name: 'sbt 0.13.15', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt test"
      }
    }

    stage('Package') {
      steps {
        echo "Packaging..."
        bat "${tool name: 'sbt 0.13.15', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt package"
      }
    }

  }
}
