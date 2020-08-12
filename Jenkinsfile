/* uses sbt, which i installed with homebrew. */
/* this works without requiring the 'sbt plugin'. */

pipeline {
  environment {
     buildPath = "C:/Users/tudor.alexandru/.jenkins/workspace/Scala Simple App - Pipeline/target/scala-2.13/simple-scala-jenkins-app_2.13-0.1.jar"
  }

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
      post {
        success {
            echo "Jar created."
        }
      }
    }

    stage('Deploy') {
      steps {
         echo 'Deploying...'
        // bat "${tool name: 'sbt 0.13.15', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt package"
         bat "move \"${buildPath}\" \"C:/Users/tudor.alexandru/.jenkins/deployments/simple-scala-jenkins-app_2.13-0.1.jar\""
      }
    }

    //stage('Deploy - Production') {
    //     steps {
    //     bat './deploy production'
    //   }
    //}
  }
}
