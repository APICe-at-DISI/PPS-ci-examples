plugins {
    java
    scala
    id("com.github.maiflai.scalatest") version "0.33"
}

repositories {
    mavenCentral()
}

dependencies {
    val scalaVersion = "3.7.1"
    val (scalaMinor, _) = requireNotNull(Regex("^(\\d+)(\\.\\d+)(\\.\\d+)?$").matchEntire(scalaVersion)).destructured
    // https://mvnrepository.com/artifact/org.scala-lang/scala3-library
    implementation("org.scala-lang:scala3-library_3:${scalaVersion}")
    testImplementation("org.scalatest:scalatest_$scalaMinor:3.2.12")
    testRuntimeOnly("com.vladsch.flexmark:flexmark-all:0.64.8")
}
