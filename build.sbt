version := "0.1"

scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "RDD to Dataframe"
  )
val sparkVersion = "3.0.2"
val vegasVersion = "0.3.11"
val postgresVersion = "42.2.2"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  // logging
  "org.apache.logging.log4j" % "log4j-api" % "2.4.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.4.1",
  // postgres for DB connectivity
  "org.postgresql" % "postgresql" % postgresVersion,
  "org.scalatest" %% "scalatest" % "3.1.2" % Test
)
