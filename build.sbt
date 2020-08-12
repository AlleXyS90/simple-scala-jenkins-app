name := "simple-scala-jenkins-app"

herokuAppName in Compile := "scala-app"

version := "0.1"

enablePlugins(JavaServerAppPackaging)

scalaVersion := "2.13.3"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
