plugins {
    java
    scala
    id("org.scoverage") version "7.0.1"
    id("com.github.maiflai.scalatest") version "0.32"
}

repositories {
    mavenCentral()
}

scoverage {
    this.scoverageVersion.set("2.0.7")
}

dependencies {
    val scalaVersion = "3.2.2"
    val crossWithScala2 = "2.13"
    val (scalaMinor, _) = requireNotNull(Regex("^(\\d+)(\\.\\d+)(\\.\\d+)?$").matchEntire(scalaVersion)).destructured
    // https://mvnrepository.com/artifact/org.scala-lang/scala3-library
    implementation("org.scala-lang:scala3-library_3:${scalaVersion}")
    testImplementation("org.scalatest:scalatest_$scalaMinor:3.2.12")
    testRuntimeOnly("com.vladsch.flexmark:flexmark-all:0.64.0")
}

// Force a scoverage report if check is requested
tasks.check {
    dependsOn(tasks.reportScoverage)
}
