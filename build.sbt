name := "spark-streaming-scala"

version := "0.1"

//scalaVersion := "2.12.15"
scalaVersion := "2.13.14"
val sparkVersion = "3.5.1"

//libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core" % "3.1.2",
//  "org.apache.spark" %% "spark-sql" % "3.1.2",
//  "org.apache.spark" %% "spark-mllib" % "3.1.2",
//  "org.apache.spark" %% "spark-streaming" % "3.1.2",
//  "org.twitter4j" % "twitter4j-core" % "4.0.4",
//  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
//  "com.twitter" % "jsr166e" % "1.1.0",
//  "com.datastax.spark" %% "spark-cassandra-connector" % "3.1.0",
//  "org.apache.spark" %% "spark-streaming-flume" % "2.4.8",
//  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "3.1.2",
//  "org.apache.spark" %% "spark-streaming-kinesis-asl" % "3.1.2"
//)


//val sparkVersion = "2.4.8"
//val sparkVersion = "3.5.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.twitter4j" % "twitter4j-core" % "4.0.4",
  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
  "com.twitter" % "jsr166e" % "1.1.0",
  "com.datastax.spark" %% "spark-cassandra-connector" % sparkVersion,
//  "org.apache.spark" % "spark-streaming-flume_2.12" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-kinesis-asl" % sparkVersion
)

//"com.datastax.spark" % "spark-cassandra-connector_2.12" % "3.1.0",