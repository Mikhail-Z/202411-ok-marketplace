plugins {
    kotlin("jvm") version "2.1.0"
}

group = "me.zabelin.otuskotlin.marketplace"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}