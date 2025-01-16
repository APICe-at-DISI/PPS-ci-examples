plugins {
    java
    scala
    groovy
    kotlin("jvm") version "2.1.0"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.codehaus.groovy:groovy:3.0.23")
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala3-library_3:3.6.3")
}
