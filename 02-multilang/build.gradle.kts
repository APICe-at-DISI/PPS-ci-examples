plugins {
    java
    scala
    groovy
    kotlin("jvm") version "2.2.20"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.codehaus.groovy:groovy:3.0.25")
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala3-library_3:3.7.3")
}
