plugins {
    id("java")
    kotlin("jvm") version "1.6.0"
    `maven-publish`
}

group = "br.com.avati.thirdparty"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "br.com.avati.thirdparty"
            artifactId = "sifen-lib"
            version = "1.0.0"

            from(components["java"])
        }
    }
}