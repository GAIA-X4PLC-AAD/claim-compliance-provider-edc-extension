plugins {
    `java-library`
    java
    `maven-publish`
}

group = "com.msg.plcaad.edc"
version = "1.0.0"

repositories {
    mavenLocal()
    mavenCentral()
}

val edcVersion: String by project

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = project.group.toString()
            artifactId = rootProject.name
            version = project.version.toString()
        }
    }
    repositories {
        maven {
            name = "github"
            url = uri("https://maven.pkg.github.com/GAIA-X4PLC-AAD/claim-compliance-provider-edc-extension")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
                password = project.findProperty("gpr.token") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
