buildscript {
    repositories {
        mavenCentral()
        google()
        mavenLocal()
        jcenter()

    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.11")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.11")
        classpath("com.android.tools.build:gradle:3.3.1")
        classpath("com.cdsap:talaiot:0.1.17")
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
