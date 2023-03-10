plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.thelazybattley.nolimetangerereviewer.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.thelazybattley.nolimetangerereviewer.android"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:${Versions.Android.composeVersion}")
    implementation("androidx.compose.ui:ui-tooling:${Versions.Android.composeVersion}")
    implementation("androidx.compose.ui:ui-tooling-preview:${Versions.Android.composeVersion}")
    implementation("androidx.compose.foundation:foundation:${Versions.Android.composeFoundationVersion}")
    implementation("androidx.compose.material:material:${Versions.Android.composeMaterialVersion}")
    implementation("androidx.activity:activity-compose:${Versions.Android.composeActivityVersion}")
}
