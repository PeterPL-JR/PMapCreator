plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.formdev:flatlaf:3.5.2")
    implementation("com.google.code.gson:gson:2.11.0")
}

sourceSets {
    main {
        resources {
            srcDir("res")
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}