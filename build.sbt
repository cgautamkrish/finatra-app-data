import NativePackagerKeys._

packageArchetype.java_application

name := "finatra_api"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.6.0",
  "org.scalaj" % "scalaj-http_2.8.1" % "0.3.0"
)

resolvers +=
  "Twitter" at "http://maven.twttr.com"
