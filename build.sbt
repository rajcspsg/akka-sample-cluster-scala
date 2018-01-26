name := "akka-sample-cluster-scala"

version := "1.0"

scalaVersion := "2.12.4"

description := "Akka Clustering using Scala"

val akkaVersion = "2.5.8"

lazy val akka_sample_cluster = (project in file("akka-simple-cluster")).settings(
    name := "akka-simple-cluster",
    version := "1.0",
    scalaVersion := "2.12.4",
    description := "Akka Clustering using Scala"
)

lazy val akka_zk_cluster = (project in file("akka-zk-cluster")).settings(
    name := "akka-zk-cluster",
    version := "1.0",
    scalaVersion := "2.12.4",
    description := "Akka Clustering with Zookeeper"
)

