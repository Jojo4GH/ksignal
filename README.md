# Ksignal

[![Maven Central][ksignal-maven-badge]][ksignal-maven]
[![GitHub][ksignal-license-badge]](LICENSE)

[![Kotlin Multiplatform][kotlin-multiplatform-badge]][kotlin-multiplatform]
[![JVM Platform][jvm-platform-badge]][kotlin-jvm]
[![Linux X64 Platform][linux-x64-platform-badge]][kotlin-native]
[![Linux ARM64 Platform][linux-arm64-platform-badge]][kotlin-native]
[![MinGW X64 Platform][mingw-x64-platform-badge]][kotlin-native]
[![Android X64 Platform][android-x64-platform-badge]][kotlin-native]
[![Android ARM64 Platform][android-arm64-platform-badge]][kotlin-native]
[![Android X86 Platform][android-x86-platform-badge]][kotlin-native]
[![Android ARM32 Platform][android-arm32-platform-badge]][kotlin-native]

[ksignal-maven-badge]: https://img.shields.io/maven-central/v/de.jonasbroeckmann.ksignal/ksignal?label=Latest
[ksignal-license-badge]: https://img.shields.io/github/license/Jojo4GH/ksignal
[kotlin-multiplatform-badge]: https://img.shields.io/badge/Kotlin_Multiplatform-grey?logo=kotlin
[jvm-platform-badge]: https://img.shields.io/badge/Platform-JVM-4dbb5f
[linux-x64-platform-badge]: https://img.shields.io/badge/Native-Linux_X64-e082f3
[linux-arm64-platform-badge]: https://img.shields.io/badge/Native-Linux_ARM64-e082f3
[mingw-x64-platform-badge]: https://img.shields.io/badge/Native-MinGW_X64-e082f3
[android-x64-platform-badge]: https://img.shields.io/badge/Native-Android_X64-e082f3
[android-arm64-platform-badge]: https://img.shields.io/badge/Native-Android_ARM64-e082f3
[android-x86-platform-badge]: https://img.shields.io/badge/Native-Android_X86-e082f3
[android-arm32-platform-badge]: https://img.shields.io/badge/Native-Android_ARM32-e082f3

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
- All Apple targets (untested)

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
