plugins {
    java
    scala
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.7.3")
    // The BOM (Bill of Materials) synchronizes all the versions of Junit coherently.
    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    // The annotations, assertions and other elements we want to have access to when compiling our tests.
    testImplementation("org.junit.jupiter:junit-jupiter")
    // The engine that must be available at runtime to run the tests.
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Enables JUnit Platform (needed for JUnit 5)
tasks.named<Test>("test") {
    useJUnitPlatform()
}
