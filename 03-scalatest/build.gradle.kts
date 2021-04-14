plugins {
    java
    scala
    id("org.scoverage") version "4.0.1"
    id("com.github.maiflai.scalatest") version "0.26"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:+")
    testImplementation("org.scalatest:scalatest_2.13:+")
    testImplementation("org.scalamock:scalamock_2.13:+")
    testRuntimeOnly("com.vladsch.flexmark:flexmark-profile-pegdown:0.36.8")
    scoverage("org.scoverage:scalac-scoverage-plugin_2.13:+")
    scoverage("org.scoverage:scalac-scoverage-runtime_2.13:+")
}

// gradle clean reportScoverage
