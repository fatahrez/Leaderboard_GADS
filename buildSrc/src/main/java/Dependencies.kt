object Versions {
    const val androidGradleBuildTools = "4.2.0-alpha01"
    const val kotlin = "1.3.61"
    const val coreKtx = "1.3.1"
    const val appCompat = "1.2.0"
    const val constraintLayout = "2.0.0"
    const val materialDesign = "1.2.0"
    const val junit = "4.+"
    const val testExt = "1.1.1"
    const val espresso = "3.2.0"
}

object Dependencies {
    object ProjectPlugins {
        val androidGradleBuildTools = "com.android.tools.build:gradle:${Versions.androidGradleBuildTools}"
        val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Android {
        val compileSdkVersion = 30
        val applicationId = "com.fatah.leaderboard"
        val minSdkVersion = 21
        val targetSdkVersion = 30
        val versionCode = 1
        val versionName = "1.0"
        val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        val buildToolsVersion = "29.0.3"
    }

    object Kotlin {
        val kotlinStandardLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    }

    object AndroidX {
        val ktx = "androidx.core:core-ktx:${Versions.coreKtx}"
        val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object MaterialUI {
       val material = "com.google.android.material:material:${Versions.materialDesign}"
    }

    object TestingLibs {
       val junit = "junit:junit:${Versions.junit}"
        val testExt = "androidx.test.ext:junit:${Versions.testExt}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}