plugins {
    java
    scala
    groovy
    kotlin("jvm") version "1.3.72"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.codehaus.groovy:groovy:3.0.10")
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala-library:2.12.15")
}
