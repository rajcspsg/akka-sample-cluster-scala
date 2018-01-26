package cluster.`with`.zookeeper

import akka.actor.{ActorSystem, CoordinatedShutdown, Props}
import akka.cluster.seed.ZookeeperClusterSeed
import akka.event.Logging

import scala.concurrent.Await
import scala.concurrent.duration._

object Main extends  App {

  val system = ActorSystem("akka-cluster-zookeeper")
  ZookeeperClusterSeed(system).join()
  system.actorOf(Props[SimpleClusterListener], "cluster-listener")
  //CoordinatedShutdown.Reason
  scala.sys.addShutdownHook {
    val log = Logging(system, getClass)
    log.info("Shutting down server and actor system")
    system.terminate()
    Await.result(system.whenTerminated, 1 minute)
  }

}
