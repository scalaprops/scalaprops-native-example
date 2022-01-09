scalaVersion := "2.13.7"

crossScalaVersions += "3.1.0"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

scalapropsNativeSettings

libraryDependencies ++= Seq(
  "com.github.scalaprops" %%% "scalaprops-gen" % "0.8.4",
  "com.github.scalaprops" %%% "scalaprops" % "0.8.4" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-Xfuture",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
)
