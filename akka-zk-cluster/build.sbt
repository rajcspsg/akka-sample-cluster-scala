name := "akka-zk-cluster"
version := "1.0"
scalaVersion := "2.12.4"
description := "Akka Clustering using zookeeper"

val akkaVersion = "2.5.9"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
      "com.sclasen" %% "akka-zk-cluster-seed" % "0.1.9"
  )
