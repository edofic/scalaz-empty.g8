scalaVersion := "2.10.2"

version := "0.0.1-SNAPSHOT"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.0",
  "org.typelevel" %% "scalaz-contrib-210"        % "0.1.4",
  "org.typelevel" %% "scalaz-contrib-validation" % "0.1.4",
  "org.typelevel" %% "scalaz-contrib-undo"       % "0.1.4",
  "org.typelevel" %% "scalaz-dispatch"           % "0.1.4",
//  "org.typelevel" %% "scalaz-lift"               % "0.1.4",
  "org.typelevel" %% "scalaz-nscala-time"        % "0.1.4",
  "org.typelevel" %% "scalaz-spire"              % "0.1.4",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

initialCommands in console := "import scalaz._, Scalaz._, contrib.std._"
