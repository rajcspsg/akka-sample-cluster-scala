name := "akka-zk-cluster"
version := "1.0"
scalaVersion := "2.12.4"
description := "Akka Clustering using zookeeper"

val akkaVersion = "2.5.9"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
      "com.sclasen" % "akka-zk-cluster-seed_2.12" % "0.1.10-SNAPSHOT"
  )
