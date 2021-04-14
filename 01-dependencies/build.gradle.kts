plugins {
    java
    application
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("commons-io:commons-io:+")
    implementation("com.uwetrottmann.thetvdb-java:thetvdb-java:+")
    implementation("org.jooq:jool-java-8:+")
}
application {
    mainClassName = "it.unibo.ci.PrintBreakingBad" 
}
