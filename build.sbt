scalaVersion := "2.13.18"

crossScalaVersions += "3.8.4"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

scalapropsNativeSettings

evictionErrorLevel := Level.Warn

libraryDependencies ++= Seq(
  "com.github.scalaprops" %% "scalaprops-gen" % "0.11.0",
  "com.github.scalaprops" %% "scalaprops" % "0.11.0" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
)
