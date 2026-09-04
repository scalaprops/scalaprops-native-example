scalaVersion := "3.9.0"

crossScalaVersions += "3.9.0"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

scalapropsNativeSettings

evictionErrorLevel := Level.Warn

libraryDependencies ++= Seq(
  "com.github.scalaprops" %% "scalaprops-gen" % "0.11.1",
  "com.github.scalaprops" %% "scalaprops" % "0.11.1" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
)
