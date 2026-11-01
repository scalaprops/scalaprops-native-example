scalaVersion := "2.13.18"

crossScalaVersions += "3.9.0"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

evictionErrorLevel := Level.Warn

libraryDependencies ++= Seq(
  "com.github.scalaprops" %% "scalaprops-gen" % "0.12.0",
  "com.github.scalaprops" %% "scalaprops" % "0.12.0" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
)
