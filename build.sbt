scalaVersion := "2.11.12"

name := "scalaprops-native-example"

enablePlugins(ScalaNativePlugin)

scalapropsCoreSettings

scalapropsNativeSettings

val v = "0.6.0"

libraryDependencies ++= Seq(
  "com.github.scalaprops" %%% "scalaprops-gen" % v,
  "com.github.scalaprops" %%% "scalaprops" % v % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-Xfuture",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Yno-adapted-args"
)
