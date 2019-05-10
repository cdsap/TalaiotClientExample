buildscript {
    repositories {
        mavenCentral()
        google()
        mavenLocal()
        jcenter()

    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21")
        classpath("com.android.tools.build:gradle:3.3.2")
        classpath("com.cdsap:talaiot:0.2.0")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        mavenLocal()
        jcenter()
    }
}
