//import org.jetbrains.kotlin.ir.backend.js.compile
import java.net.URI

// Top-level build file where you can add configuration options common to all sub-projects/modules.


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
        classpath("com.android.tools.build:gradle:3.3.0")
        classpath("com.cdsap:talaiot:0.1.11")
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
