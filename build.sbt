scalaVersion := "2.13.14"

crossScalaVersions += "3.5.0"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

scalapropsNativeSettings

libraryDependencies ++= Seq(
  "com.github.scalaprops" %%% "scalaprops-gen" % "0.9.1",
  "com.github.scalaprops" %%% "scalaprops" % "0.9.1" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
)
