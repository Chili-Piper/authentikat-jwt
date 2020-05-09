
name := "authentikat-jwt"

organization := "com.chilipiper"

scalaVersion := "2.13.2"

crossScalaVersions := Seq("2.11.11", "2.12.2", "2.13.2") //sbt '+ publish'

parallelExecution := false

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.13",
  "org.json4s" %% "json4s-native" % "3.6.7",
  "org.json4s" %% "json4s-jackson" % "3.6.7",
  "org.scalatest" %% "scalatest" % "3.1.1" % Test
)

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.3"

credentials += Credentials(Path.userHome / ".mdialog.credentials")

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

bintrayRepository := "authentikat-jwt"
bintrayOrganization := Some("chili-piper")
bintrayReleaseOnPublish := true
licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

