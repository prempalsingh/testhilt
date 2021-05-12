plugins {
    id("java-library")
    id("kotlin")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${deps.versions.kotlin}")

    // https://mvnrepository.com/artifact/javax.inject/javax.inject
    implementation("javax.inject:javax.inject:1")
}