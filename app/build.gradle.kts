plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("kotlin-android")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    buildToolsVersion(Dependencies.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Dependencies.Android.applicationId
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Android.versionCode
        versionName = Dependencies.Android.versionName

        testInstrumentationRunner = Dependencies.Android.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility =  JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Dependencies.Kotlin.kotlinStandardLib)
    implementation(Dependencies.AndroidX.ktx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.MaterialUI.material)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")
    implementation("androidx.constraintlayout:constraintlayout:2.0.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    testImplementation(Dependencies.TestingLibs.junit)
    androidTestImplementation(Dependencies.TestingLibs.testExt)
    androidTestImplementation(Dependencies.TestingLibs.espresso)
}