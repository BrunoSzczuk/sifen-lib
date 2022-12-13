plugins {
    `java-library`
    `maven-publish`
}

group = "br.com.avati.thirdparty"
version = "1.0"

repositories {
    mavenCentral()
}
java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8
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