# MyLibrary
This is a modular Java library with three modules:

1. **module.one**: Provides a utility class (`Utility`) and an enum (`Status`).
2. **module.two**: Defines an interface (`MyInterface`) and a class (`ActionHandler`) that implements it.
3. **module.three**: Demonstrates the usage of the first two modules in the `Demo` class.

## Usage with Maven (via JitPack)
Add the following to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.username</groupId>
        <artifactId>MyLibrary</artifactId>
        <version>v1.0</version>
    </dependency>
</dependencies>
```

Replace `username` with your GitHub username.

[![](https://jitpack.io/v/testdeve4/testlibjava.svg)](https://jitpack.io/#testdeve4/testlibjava)


