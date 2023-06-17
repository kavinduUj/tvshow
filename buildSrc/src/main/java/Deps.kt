object DependencyVersions{

    const val applicationId = "com.uj47.tvshow"
    const val compileSdk = 33
    const val minSdk = 21
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
}

object KotlinOptions{
    const val jvmTarget = "1.8"
}

object AndroidX {
    const val core = "androidx.core:core-ktx:1.10.0"
    const val appcompat = "androidx.appcompat:appcompat:1.6.1"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val vLifecycle = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    const val vCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1"
    const val vLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
}

object Testing {
    const val junit = "junit:junit:4.13.2"
    const val extJunit = "androidx.test.ext:junit:1.1.5"
    const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
}

object KotlinX{
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
}

object Retrofit2{
    const val retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
    const val gson = "com.squareup.retrofit2:converter-gson:2.9.0"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:4.9.0"
}

object Google{
    const val hilt = "com.google.dagger:hilt-android:2.44"
    const val compiler = "com.google.dagger:hilt-android-compiler:2.44"
    const val material = "com.google.android.material:material:1.8.0"
}