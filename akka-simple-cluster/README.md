There are 2 ways we can execute the below app

<b>Single Terminal</b>

    Open the terminal window. Run the below commands in the window.

    1. `cd` into the project folder.
    2. go into sbt mode by running command `sbt`.
    3.  `project akka-simple-cluster`
    4. `runMain sample.cluster.simple.SimpleClusterApp 2551 2552 0`

<b>Multiple Terminal</b>

Open 3 terminal windows. Run the below commands in each window.

    1. `cd` into the project folder.
    2. go into sbt mode by running command `sbt`.
    3.  `project akka-simple-cluster`
    4. In each window run one of below commands
    
        `sbt runMain sample.cluster.simple.SimpleClusterApp 2551`
        `sbt runMain sample.cluster.simple.SimpleClusterApp 2552`
        `sbt runMain sample.cluster.simple.SimpleClusterApp`
