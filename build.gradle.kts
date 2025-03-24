plugins {
    kotlin("multiplatform") version "2.1.20"
    id("org.jetbrains.dokka") version "2.0.0"
    id("com.vanniktech.maven.publish.base") version "0.31.0"
}

group = property("GROUP")!!
version = property("VERSION_NAME")!!

repositories {
    mavenCentral()
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }
    explicitApi()

    jvm()

    mingwX64()

    linuxX64()
    linuxArm64()

    androidNativeX64()
    androidNativeArm64()
    androidNativeX86()
    androidNativeArm32()

    macosX64()
    macosArm64()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    watchosX64()
    watchosArm64()
    watchosSimulatorArm64()
    watchosDeviceArm64()
    watchosArm32()

    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()
}

dokka {
    dokkaSourceSets.configureEach {
        sourceLink {
            localDirectory.set(rootDir)
            remoteUrl("https://github.com/Jojo4GH/ksignal/tree/master")
        }
    }
}

mavenPublishing {
    pomFromGradleProperties()
    configure(com.vanniktech.maven.publish.KotlinMultiplatform())
    publishToMavenCentral(com.vanniktech.maven.publish.SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}
