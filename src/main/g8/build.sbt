scalaVersion := "2.10.0"

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "org.scalaz" % "scalaz-core_2.10" % "7.0-SNAPSHOT"

initialCommands in console := "import scalaz._, Scalaz._"
