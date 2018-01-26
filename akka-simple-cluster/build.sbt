name := "akka-simple-cluster"
version := "1.0"
scalaVersion := "2.12.4"
description := "Akka Clustering using Scala without zookeeper"

val akkaVersion = "2.5.9"

lazy val `akka-sample-cluster` = (project in file(".")) //.settings(multiJVMSettings: _*)
  .settings(   scalacOptions in Compile ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlog-reflective-calls", "-Xlint"),
  javacOptions in Compile ++= Seq("-Xlint:unchecked", "-Xlint:deprecation"),
  javaOptions in run ++= Seq("-Xms128m", "-Xmx1024m", "-Djava.library.path=./target/native"),
  fork in run := true,
  mainClass in (Compile, run) := Some("sample.cluster.simple.SimpleClusterApp"),
  // disable parallel tests
  parallelExecution in Test := false,
  licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))
)



libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "io.kamon" % "sigar-loader" % "1.6.6-rev002")