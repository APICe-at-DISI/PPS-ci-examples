plugins {
    java
    scala
    groovy
    kotlin("jvm") version "2.0.10"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.codehaus.groovy:groovy:3.0.22")
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala3-library_3:3.5.0")
}
