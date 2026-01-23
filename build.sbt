scalaVersion := "2.13.18"

crossScalaVersions += "3.8.1"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

scalapropsNativeSettings

libraryDependencies ++= Seq(
  "com.github.scalaprops" %%% "scalaprops-gen" % "0.10.0",
  "com.github.scalaprops" %%% "scalaprops" % "0.10.0" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-language:existentials",
  "-language:implicitConversions",
)
