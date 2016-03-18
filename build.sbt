// sbt clean test run

enablePlugins(ScalaJSPlugin)

name := "com.daggerok.scala.js-starter"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.7"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.19"

libraryDependencies += "org.scala-js" % "scalajs-library_2.11" % "0.6.7"

libraryDependencies += "junit" % "junit" % "4.12"

libraryDependencies += "org.scalactic" % "scalactic_2.11" % "2.2.6"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6"

libraryDependencies += "org.specs2" % "specs2_2.11" % "3.7"

libraryDependencies += "org.scala-tools.testing" % "scalacheck" % "1.6"

scalacOptions in Test ++= Seq("-Yrangepos")
