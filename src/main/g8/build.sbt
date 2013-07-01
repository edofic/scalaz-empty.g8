scalaVersion := "2.10.2"

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.0",
  "org.typelevel" %% "scalaz-contrib-210"        % "0.1.4",
  "org.typelevel" %% "scalaz-contrib-validation" % "0.1.4",
  "org.typelevel" %% "scalaz-contrib-undo"       % "0.1.4",
  "org.typelevel" %% "scalaz-dispatch"           % "0.1.4",
  "org.typelevel" %% "scalaz-lift"               % "0.1.4",
  "org.typelevel" %% "scalaz-nscala-time"        % "0.1.4",
  "org.typelevel" %% "scalaz-spire"              % "0.1.4"
)

initialCommands in console := "import scalaz._, Scalaz._, contrib.std._"
