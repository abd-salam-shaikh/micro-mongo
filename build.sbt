name := "micro-mongo"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.4",
  "com.typesafe.akka" %% "akka-remote" % "2.4.4",
  "org.mongodb.scala" %% "mongo-scala-driver" % "1.1.0",
  "com.typesafe.play" %% "play-json" % "2.5.2"
)

fork in run := true