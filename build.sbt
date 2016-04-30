name := "micro-mongo"

version := "1.0"

scalaVersion := "2.11.8"

val akkaV = "2.4.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-remote" % akkaV,
  "org.mongodb.scala" %% "mongo-scala-driver" % "1.1.0",
  "com.typesafe.play" %% "play-json" % "2.5.2",
  "com.google.inject" % "guice" % "4.0"
)

fork in run := true