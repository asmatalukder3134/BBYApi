plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation(platform("org.junit.jupiter:junit-jupiter"))
    testImplementation(platform("com.intuit.karate:karate-core:1.4.1"))
    testImplementation (platform("com.intuit.karate:karate-apache:0.9.6"))
    testImplementation (platform("com.intuit.karate:karate-junit4:1.4.0.RC1"))

}
 
tasks.test {
    useJUnitPlatform()
}