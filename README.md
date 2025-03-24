# Ksignal

[![Maven Central][ksignal-maven-badge]][ksignal-maven]
[![GitHub][ksignal-license-badge]](LICENSE)

[![Kotlin Multiplatform][kotlin-multiplatform-badge]][kotlin-multiplatform]
[![JVM Platform][jvm-platform-badge]][kotlin-jvm]
[![Linux Native][linux-native-badge]][kotlin-native]
[![Windows Native][windows-native-badge]][kotlin-native]
[![Android Native][android-native-badge]][kotlin-native]
[![macOS Native][macos-native-badge]][kotlin-native]
[![iOS Native][ios-native-badge]][kotlin-native]
[![watchOS Native][watchos-native-badge]][kotlin-native]
[![tvOS Native][tvos-native-badge]][kotlin-native]

[//]: # ([![Linux X64 Platform][linux-x64-platform-badge]][kotlin-native])
[//]: # ([![Linux ARM64 Platform][linux-arm64-platform-badge]][kotlin-native])
[//]: # ([![MinGW X64 Platform][mingw-x64-platform-badge]][kotlin-native])
[//]: # ([![Android X64 Platform][android-x64-platform-badge]][kotlin-native])
[//]: # ([![Android ARM64 Platform][android-arm64-platform-badge]][kotlin-native])
[//]: # ([![Android X86 Platform][android-x86-platform-badge]][kotlin-native])
[//]: # ([![Android ARM32 Platform][android-arm32-platform-badge]][kotlin-native])
[//]: # ([![macOS X64 Platform][macos-x64-platform-badge]][kotlin-native])
[//]: # ([![macOS ARM64 Platform][macos-arm64-platform-badge]][kotlin-native])
[//]: # ([![iOS X64 Platform][ios-x64-platform-badge]][kotlin-native])
[//]: # ([![iOS ARM64 Platform][ios-arm64-platform-badge]][kotlin-native])
[//]: # ([![iOS Simulator ARM64 Platform][ios-simulator-arm64-platform-badge]][kotlin-native])
[//]: # ([![watchOS X64 Platform][watchos-x64-platform-badge]][kotlin-native])
[//]: # ([![watchOS ARM64 Platform][watchos-arm64-platform-badge]][kotlin-native])
[//]: # ([![watchOS Simulator ARM64 Platform][watchos-simulator-arm64-platform-badge]][kotlin-native])
[//]: # ([![watchOS Device ARM64 Platform][watchos-device-arm64-platform-badge]][kotlin-native])
[//]: # ([![watchOS ARM32 Platform][watchos-arm32-platform-badge]][kotlin-native])
[//]: # ([![tvOS X64 Platform][tvos-x64-platform-badge]][kotlin-native])
[//]: # ([![tvOS ARM64 Platform][tvos-arm64-platform-badge]][kotlin-native])
[//]: # ([![tvOS Simulator ARM64 Platform][tvos-simulator-arm64-platform-badge]][kotlin-native])

[ksignal-maven-badge]: https://img.shields.io/maven-central/v/de.jonasbroeckmann.ksignal/ksignal?label=Latest
[ksignal-license-badge]: https://img.shields.io/github/license/Jojo4GH/ksignal
[kotlin-multiplatform-badge]: https://img.shields.io/badge/Kotlin_Multiplatform-grey?logo=kotlin
[jvm-platform-badge]: https://img.shields.io/badge/Platform-JVM-4dbb5f
[linux-native-badge]: https://img.shields.io/badge/Native-Linux-e082f3
[windows-native-badge]: https://img.shields.io/badge/Native-Windows-e082f3
[android-native-badge]: https://img.shields.io/badge/Native-Android-e082f3
[macos-native-badge]: https://img.shields.io/badge/Native-macOS-e082f3
[ios-native-badge]: https://img.shields.io/badge/Native-iOS-e082f3
[watchos-native-badge]: https://img.shields.io/badge/Native-watchOS-e082f3
[tvos-native-badge]: https://img.shields.io/badge/Native-tvOS-e082f3
[linux-x64-platform-badge]: https://img.shields.io/badge/Native-Linux_X64-e082f3
[linux-arm64-platform-badge]: https://img.shields.io/badge/Native-Linux_ARM64-e082f3
[mingw-x64-platform-badge]: https://img.shields.io/badge/Native-MinGW_X64-e082f3
[android-x64-platform-badge]: https://img.shields.io/badge/Native-Android_X64-e082f3
[android-arm64-platform-badge]: https://img.shields.io/badge/Native-Android_ARM64-e082f3
[android-x86-platform-badge]: https://img.shields.io/badge/Native-Android_X86-e082f3
[android-arm32-platform-badge]: https://img.shields.io/badge/Native-Android_ARM32-e082f3
[macos-x64-platform-badge]: https://img.shields.io/badge/Native-macOS_X64-e082f3
[macos-arm64-platform-badge]: https://img.shields.io/badge/Native-macOS_ARM64-e082f3
[ios-x64-platform-badge]: https://img.shields.io/badge/Native-iOS_X64-e082f3
[ios-arm64-platform-badge]: https://img.shields.io/badge/Native-iOS_ARM64-e082f3
[ios-simulator-arm64-platform-badge]: https://img.shields.io/badge/Native-iOS_Simulator_ARM64-e082f3
[watchos-x64-platform-badge]: https://img.shields.io/badge/Native-watchOS_X64-e082f3
[watchos-arm64-platform-badge]: https://img.shields.io/badge/Native-watchOS_ARM64-e082f3
[watchos-simulator-arm64-platform-badge]: https://img.shields.io/badge/Native-watchOS_Simulator_ARM64-e082f3
[watchos-device-arm64-platform-badge]: https://img.shields.io/badge/Native-watchOS_Device_ARM64-e082f3
[watchos-arm32-platform-badge]: https://img.shields.io/badge/Native-watchOS_ARM32-e082f3
[tvos-x64-platform-badge]: https://img.shields.io/badge/Native-tvOS_X64-e082f3
[tvos-arm64-platform-badge]: https://img.shields.io/badge/Native-tvOS_ARM64-e082f3
[tvos-simulator-arm64-platform-badge]: https://img.shields.io/badge/Native-tvOS_Simulator_ARM64-e082f3

[ksignal-maven]: https://central.sonatype.com/artifact/de.jonasbroeckmann.ksignal/ksignal
[kotlin-multiplatform]: https://kotlinlang.org/docs/multiplatform.html
[kotlin-native]: https://kotlinlang.org/docs/native-overview.html
[kotlin-jvm]: https://kotlinlang.org/docs/jvm-get-started.html

A Kotlin Multiplatform library that aggregates platform specific signal handling into a clean common API.

## ⭐️ Supported Targets

Currently ksignal supports the following targets:

- `jvm`
- `linuxX64`
- `linuxArm64`
- `mingwX64`
- `androidNativeX64`
- `androidNativeArm64`
- `androidNativeX86`
- `androidNativeArm32`
- Apple targets (untested)
  - `macosX64`
  - `macosArm64`
  - `iosX64`
  - `iosArm64`
  - `iosSimulatorArm64`
  - `watchosX64`
  - `watchosArm64`
  - `watchosSimulatorArm64`
  - `watchosDeviceArm64`
  - `watchosArm32`
  - `tvosX64`
  - `tvosArm64`
  - `tvosSimulatorArm64`

## 🛠️ Installation

The ksignal dependency is available on Maven Central and can be added to your common source set.
Just replace `$ksignalVersion` with the [latest version](#ksignal).

<details open>
<summary>Gradle - Kotlin DSL</summary>

```kotlin
implementation("de.jonasbroeckmann.ksignal:ksignal:$ksignalVersion")
```
</details>

<details>
<summary>Gradle - Groovy DSL</summary>

```groovy
implementation "de.jonasbroeckmann.ksignal:ksignal:$ksignalVersion"
```
</details>

<details>
<summary>Maven</summary>

```xml
<dependencies>
    <dependency>
        <groupId>de.jonasbroeckmann.ksignal</groupId>
        <artifactId>ksignal</artifactId>
        <version>$ksignalVersion</version>
    </dependency>
</dependencies>
```
</details>

## 🚀 Usage

#### Handle signals

```kotlin
Signal.ABRT.handle { println("Received abort") } // Returns the previous handler
```

#### Temporarily handle signals

```kotlin
Signal.INT.withHandler(
    Signal.Handler { println("Received interrupt") }
) {
    // Do some stuff that might be interrupted
}
// The previous handler is restored after the block
```

#### Await signals

```kotlin
Signal.TERM.await() // Suspends until the signal is raised
```

#### Raise signals

```kotlin
Signal.SEGV.raise()
```

## 🚧 Contributing

If you have any feedback or ideas, feel free to open an issue or create a pull request.

## 📄 License

This project is licensed under the [MIT License](LICENSE).
