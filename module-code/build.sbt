import play.sbt.PlayImport.PlayKeys._

// import SonatypeKeys._

// Import default settings. This changes `publishTo` settings to use the Sonatype repository and add several commands for publishing.
// sonatypeSettings

name := "SecureSocial"

version := Common.version

scalaVersion := Common.scalaVersion
crossScalaVersions := Common.crossScalaVersions

libraryDependencies ++= Seq(
  ws,
  filters,
  specs2 % "test",
  cacheApi,
  "com.typesafe.play" %% "play-mailer-guice" % "6.0.1", // this could be play-mailer but wouldn't have the guice module
  "io.methvin.play" %% "autoconfig-macros" % "0.2.0" % "provided",
  "org.mindrot" % "jbcrypt" % "0.3m"
)

resolvers ++= Seq(
  Resolver.typesafeRepo("releases")
)

organization := "io.fintel"

organizationName := ""

organizationHomepage := Some(new URL("https://github.com/FintelVentures"))

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

publishTo := sonatypePublishTo.value

startYear := Some(2012)

description := "An authentication module for Play Framework applications supporting OAuth, OAuth2, OpenID, Username/Password and custom authentication schemes."

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/FintelVentures"))

pomExtra := (
  <scm>
    <url>https://github.com/FintelVentures/securesocial</url>
    <connection>scm:git:git@github.com:FintelVentures/securesocial.git</connection>
    <developerConnection>scm:git:https://github.com/FintelVentures/securesocial.git</developerConnection>
  </scm>
  <developers>
    <developer>
      <id>risenhoover</id>
      <name>Wilton Risenhoover</name>
    </developer>
  </developers>
)

scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature", "-Xmax-classfile-name","78")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF-8",  "-Xlint:-options", "-Xlint:unchecked", "-Xlint:deprecation" )

// packagedArtifacts += ((artifact in playPackageAssets).value -> playPackageAssets.value)

routesImport += "securesocial.controllers.Implicits._"