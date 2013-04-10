import sbt._
import Keys._
import scala.Some

object FetcherBuild extends Build {
  val Organization = "com.indix"
  val Version      = "0.1"
  val ScalaVersion = "2.10.0"

  lazy val project = Project(
    id = "scala-project-template",
    base = file("."),
    settings = defaultSettings ++ Seq(
      libraryDependencies ++= Dependencies.project_dep
    )
  )

  lazy val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := Organization,
    version      := Version,
    scalaVersion := ScalaVersion,
    crossPaths   := false,
    organizationName := "Indix",
    organizationHomepage := Some(url("http://www.indix.com"))
  )

  lazy val defaultSettings = buildSettings ++ Seq(
    resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",

    // compile options
    scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked"),
    javacOptions  ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

  )
}

object Dependencies {
  import Dependency._

  val project_dep = Seq(
    scalaTest
  )
}

object Dependency {

  // Versions
  object V {
    val scalatest = "1.9.1"
  }

  val scalaTest = "org.scalatest" %% "scalatest" % V.scalatest % "test"
}
