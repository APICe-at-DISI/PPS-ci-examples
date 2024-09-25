plugins {
    java
    scala
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.5.1")
    val junitVersion = "5.11.1"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

// Enables JUnit Platform (needed for JUnit 5)
tasks.named<Test>("test") {
    useJUnitPlatform()
}
