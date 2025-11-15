plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "sv.edu.ues.dam235.minirestaurantmanager"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "sv.edu.ues.dam235.minirestaurantmanager"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Accede a la variable usando project.properties
        // CORRECT Kotlin syntax
        buildConfigField("String", "MI_CLAVE_API", "\"${project.properties["mi_clave_api"]}\"")
        buildConfigField("String", "MI_VERSION", "\"${project.properties["mi_version"]}\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.annotation)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}