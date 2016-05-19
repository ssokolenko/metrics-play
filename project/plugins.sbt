resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.3")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")

// Plugin for publishing to bintray
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
