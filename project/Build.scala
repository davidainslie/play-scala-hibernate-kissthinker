import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName         = "play-scala-hibernate-kissthinker"

  val appVersion      = "1.0-SNAPSHOT"

  val scalaVersion    = "2.11.1"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
	  "org.specs2" %% "specs2" % "1.12.3" % "test" withSources() withJavadoc(),
	  "org.hibernate" % "hibernate-core" % "4.2.1.Final",
    "org.hibernate" % "hibernate-entitymanager" % "4.2.1.Final"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )
}