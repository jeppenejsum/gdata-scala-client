name := "gdata-scala-client"

version := "1.0.0"

//scalaVersion := "2.9.3"
scalaVersion := "2.10.1"

scalacOptions ++= Seq("-deprecation")

scalaSource in Compile <<= baseDirectory(_ / "src")

javaSource in Compile <<= baseDirectory(_ / "src")

//unmanagedSourceDirectories in Compile <<= 

scalaSource in Test <<= baseDirectory(_ / "tests")

javaSource in Test <<= baseDirectory(_ / "tests")

resourceDirectory in Test <<= baseDirectory(_ / "test-data")
//resourceDirectory <<= baseDirectory(_ / "test-data")

//libraryDependencies += "org.scalatest" %% "scalatest" % "1.8" % "test"
//libraryDependencies += "org.scalatest" % "scalatest_2.10.0" % "1.8" //% "test"

//libraryDependencies += "junit" % "junit" % "4.10" //% "test"

//resolvers += Classpaths.typesafeResolver

//resolvers += "typesafe2" at "http://repo.typesafe.com/typesafe/simple/ivy-releases/"
//resolvers += "namin.github.com/maven-repository" at "http://namin.github.com/maven-repository/"

//resolvers += "Spray Repository" at "http://repo.spray.cc/"

//resolvers += "typesave" at "http://repo.typesafe.com/typesafe/releases"

//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.2")
