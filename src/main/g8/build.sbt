scalaVersion := "2.10.0"

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scalaz" % "scalaz-core_2.10" % "7.0-SNAPSHOT",
  "org.typelevel" % "scalaz-contrib-210_2.10" % "0.2-SNAPSHOT"
)

initialCommands in console := "import scalaz._, Scalaz._, contrib.std._"
