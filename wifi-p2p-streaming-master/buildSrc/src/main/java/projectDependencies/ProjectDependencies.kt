package projectDependencies

//object ProjectDependencies {
////
////
////    val coreUI = arrayOf(
////        "androidx.appcompat:appcompat:$APPCOMPAT_VERSION",
////        "androidx.activity:activity-ktx:$ACTIVITY_KTX_VERSION",
////        "androidx.fragment:fragment:$FRAGMENT_KTX_VERSION",
////        "androidx.fragment:fragment-ktx:$FRAGMENT_KTX_VERSION",
////        "com.google.android.material:material:$MATERIAL_VERSION",
////        "androidx.cardview:cardview:$CARDVIEW_VERSION",
////        "androidx.recyclerview:recyclerview:$RECYCLER_VIEW_VERSION",
////        "androidx.core:core:$CORE_VERSION",
////        "androidx.core:core-ktx:$CORE_KTX_VERSION",
////        "androidx.swiperefreshlayout:swiperefreshlayout:$REFRESH_LAYOUT_VERSION",
////        "androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VERSION",
////        "androidx.constraintlayout:constraintlayout-solver:$CONSTRAINT_LAYOUT_VERSION",
////        "androidx.viewpager2:viewpager2:$VIEWPAGER2_VERSION",
////        "androidx.browser:browser:$BROWSER_VERSION",
////        "androidx.core:core-splashscreen:$SPLASH_SCREEN_VERSION",
////        "androidx.window:window:$WINDOW_VERSION"
////    )
////
////    val supportLibs = arrayOf(
////        "androidx.annotation:annotation:$ANNOTATION_VERSION",
////        "androidx.biometric:biometric:$FINGERPRINT_VERSION",
////        "androidx.legacy:legacy-support-v4:$LEGACY_SUPPORT_VERSION",
////        "androidx.concurrent:concurrent-futures-ktx:$CONCURRENT_FUTURES_KTX_VERSION",
////    )
////
////    val extrasLibs = arrayOf(
////        "com.github.ravindu1024:android-keyboardlistener:$KEYBOARD_LISTENER_VERSION",
////        "com.facebook.shimmer:shimmer:$SHIMMER_VERSION",
////        "io.github.everythingme:overscroll-decor-android:$OVERSCROLL_LIBS_VERSION",
////        "com.github.bumptech.glide:glide:$GLIDE_VERSION",
////    )
////
////    val networking = arrayOf(
////        "com.squareup.okhttp3:okhttp:$OKHTTP",
////        "com.squareup.okhttp3:logging-interceptor:$OKHTTP",
////        "com.squareup.retrofit2:retrofit:$RETROFIT2_VERSION",
////        "com.squareup.retrofit2:converter-gson:$RETROFIT2_VERSION",
////        "com.google.code.gson:gson:$GSON_VERSION",
////    )
////
////    val rx = arrayOf(
////        "io.reactivex.rxjava3:rxjava:$RX_JAVA_VERSION",
////        "io.reactivex.rxjava3:rxkotlin:$RX_KOTLIN_VERSION",
////        "io.reactivex.rxjava3:rxandroid:$RX_ANDROID_VERSION",
////        "com.jakewharton.rxbinding4:rxbinding:$RX_BINDING_VERSION",
////    )
////
////    val di = arrayOf(
////        "com.google.dagger:hilt-android:$HILT_VERSION",
////        "androidx.hilt:hilt-work:$HILT_WORKER_VERSION"
////    )
////
////    val lifecycle = arrayOf(
////        "androidx.lifecycle:lifecycle-extensions:2.3.1",
////        "androidx.lifecycle:lifecycle-livedata:$LIFECYCLE_KTX_VERSION",
////        "androidx.lifecycle:lifecycle-runtime-ktx:$LIFECYCLE_KTX_VERSION",
////        "androidx.lifecycle:lifecycle-reactivestreams:$LIFECYCLE_KTX_VERSION",
////        "androidx.lifecycle:lifecycle-viewmodel-ktx:$VIEWMODEL_KTX_VERSION",
////        "androidx.lifecycle:lifecycle-reactivestreams-ktx:$REACTIVESTREAMS_KTX_VERSION",
////    )
////
////    val paging = arrayOf(
////        "androidx.paging:paging-common:$PAGING_VERSION",
////        "androidx.paging:paging-runtime:$PAGING_VERSION",
////    )
////
////    val database = arrayOf(
////        "androidx.room:room-runtime:$ROOM_VERSION",
////        "androidx.room:room-ktx:$ROOM_VERSION",
////    )
////
////    val work = arrayOf(
////        "androidx.work:work-runtime-ktx:$WORK_MANAGER_VERSION",
////        "androidx.work:work-runtime:$WORK_MANAGER_VERSION"
////    )
////
////    val navigation = arrayOf(
////        "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION",
////        "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION",
////    )
////
////    val playServices = arrayOf(
////        "com.google.android.play:core:$PLAY_CORE_VERSION",
////        "com.google.android.gms:play-services-location:$PLAY_LOCATION_VERSION",
////    )
////
////    val analytics = arrayOf(
////        "com.google.firebase:firebase-crashlytics-ktx:$FIREBASE_CRASHLYTICS_VERSION",
////        "com.google.firebase:firebase-analytics-ktx:$FIREBASE_ANALYTICS_VERSION",
////        "com.google.firebase:firebase-analytics:20.0.0" ,
////        "com.google.firebase:firebase-auth:21.0.1",
////        "com.google.firebase:firebase-bom:32.8.0",
////    )
////
////    val cameraX = arrayOf(
////        "androidx.camera:camera-core:$CAMERAX_VERSION",
////        "androidx.camera:camera-camera2:$CAMERAX_VERSION",
////        "androidx.camera:camera-lifecycle:$CAMERAX_VERSION",
////        "androidx.camera:camera-view:$CAMERAX_VERSION",
////    )
////
////    val processing = arrayOf(
////        "com.google.dagger:hilt-android-compiler:$HILT_VERSION",
////        "com.google.dagger:hilt-compiler:$HILT_COMPILER_VERSION",
////        "com.github.bumptech.glide:compiler:$GLIDE_VERSION",
////        "androidx.room:room-compiler:$ROOM_VERSION",
////    )
////
////    val logging = arrayOf(
////        "com.jakewharton.timber:timber:$TIMBER_VERSION"
////    )
////
////    val unitTesting = arrayOf(
////        "junit:junit:$JUNIT_VERSION",
////        "androidx.arch.core:core-testing:$CORE_TESTING_VERSION",
////        "org.jetbrains.kotlin:kotlin-test-junit:$KOTLIN_VERSION",
////        "androidx.test:runner:$TEST_RUNNER_VERSION",
////        "androidx.test:rules:$TEST_RULES_VERSION",
////        "androidx.annotation:annotation:$ANNOTATION_VERSION         ",
////        "org.mockito:mockito-core:$MOCKITO_VERSION",
////        "org.mockito.kotlin:mockito-kotlin:$MOCKITO_KOTLIN_VERSION",
////        "org.mockito:mockito-inline:$MOCKITO_VERSION",
////        "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINES_VERSION",
////        "io.mockk:mockk:$MOCKK_VERSION",
////        "io.kotest:kotest-assertions-core:$KOTEST_VERSION",
////        "org.powermock:powermock-module-junit4:$POWER_MOCK_VERSION"
////    )
////
////    val androidTesting = arrayOf(
////        "com.google.dagger:hilt-android-testing:$HILT_VERSION",
////        "org.mockito:mockito-android:$MOCKITO_VERSION",
////        "androidx.test.espresso:espresso-core:$ESPRESSO_VERSION",
////        "androidx.test.espresso:espresso-contrib:$ESPRESSO_VERSION",
////        "androidx.test.espresso:espresso-intents:$ESPRESSO_VERSION",
////    )
////
////    val devDependencies = arrayOf(
////        "com.squareup.leakcanary:leakcanary-android:$LEAK_CANARY_VERSION",
////    )
////
// }



object ProjectDependencies {
    val coreUI = arrayOf(
        "androidx.appcompat:appcompat:${DependencyVersion.APPCOMPAT_VERSION}",
        "androidx.activity:activity-ktx:${DependencyVersion.ACTIVITY_KTX_VERSION}",
        "androidx.fragment:fragment:${DependencyVersion.FRAGMENT_KTX_VERSION}",
        "androidx.fragment:fragment-ktx:${DependencyVersion.FRAGMENT_KTX_VERSION}",
        "com.google.android.material:material:${DependencyVersion.MATERIAL_VERSION}",
        "androidx.cardview:cardview:${DependencyVersion.CARDVIEW_VERSION}",
        "androidx.recyclerview:recyclerview:${DependencyVersion.RECYCLER_VIEW_VERSION}",
        "androidx.core:core:${DependencyVersion.CORE_VERSION}",
        "androidx.core:core-ktx:${DependencyVersion.CORE_KTX_VERSION}",
        "androidx.swiperefreshlayout:swiperefreshlayout:${DependencyVersion.REFRESH_LAYOUT_VERSION}",
        "androidx.constraintlayout:constraintlayout:${DependencyVersion.CONSTRAINT_LAYOUT_VERSION}",
        "androidx.constraintlayout:constraintlayout-solver:${DependencyVersion.CONSTRAINT_LAYOUT_VERSION}",
        "androidx.viewpager2:viewpager2:${DependencyVersion.VIEWPAGER2_VERSION}",
        "androidx.browser:browser:${DependencyVersion.BROWSER_VERSION}",
        "androidx.core:core-splashscreen:${DependencyVersion.SPLASH_SCREEN_VERSION}",
        "androidx.window:window:${DependencyVersion.WINDOW_VERSION}",
        "org.jetbrains.kotlin:kotlin-reflect:${DependencyVersion.KOTLIN_VERSION}"
    )

    val supportLibs = arrayOf(
        "androidx.annotation:annotation:${DependencyVersion.ANNOTATION_VERSION}",
        "androidx.biometric:biometric:${DependencyVersion.FINGERPRINT_VERSION}",
        "androidx.legacy:legacy-support-v4:${DependencyVersion.LEGACY_SUPPORT_VERSION}",
        "androidx.concurrent:concurrent-futures-ktx:${DependencyVersion.CONCURRENT_FUTURES_KTX_VERSION}",
    )
        val analytics = arrayOf(
        "com.google.firebase:firebase-crashlytics-ktx:${DependencyVersion.FIREBASE_CRASHLYTICS_VERSION}",
        "com.google.firebase:firebase-analytics-ktx:${DependencyVersion.FIREBASE_ANALYTICS_VERSION}",
        "com.google.firebase:firebase-analytics:20.0.0" ,
        "com.google.firebase:firebase-auth:21.0.1",
        "com.google.firebase:firebase-bom:32.8.0",
    )

    val extrasLibs = arrayOf(
        "com.github.ravindu1024:android-keyboardlistener:${DependencyVersion.KEYBOARD_LISTENER_VERSION}",
        "com.facebook.shimmer:shimmer:${DependencyVersion.SHIMMER_VERSION}",
        "io.github.everythingme:overscroll-decor-android:${DependencyVersion.OVERSCROLL_LIBS_VERSION}",
        "com.github.bumptech.glide:glide:${DependencyVersion.GLIDE_VERSION}",
    )

    val networking = arrayOf(
        "com.squareup.okhttp3:okhttp:${DependencyVersion.OKHTTP}",
        "com.squareup.okhttp3:logging-interceptor:${DependencyVersion.OKHTTP}",
        "com.squareup.retrofit2:retrofit:${DependencyVersion.RETROFIT2_VERSION}",
        "com.squareup.retrofit2:converter-gson:${DependencyVersion.RETROFIT2_VERSION}",
        "com.google.code.gson:gson:${DependencyVersion.GSON_VERSION}",
    )

    val rx = arrayOf(
        "io.reactivex.rxjava3:rxjava:${DependencyVersion.RX_JAVA_VERSION}",
        "io.reactivex.rxjava3:rxkotlin:${DependencyVersion.RX_KOTLIN_VERSION}",
        "io.reactivex.rxjava3:rxandroid:${DependencyVersion.RX_ANDROID_VERSION}",
        "com.jakewharton.rxbinding4:rxbinding:${DependencyVersion.RX_BINDING_VERSION}",
    )

    val di = arrayOf(
        "com.google.dagger:hilt-android:${DependencyVersion.HILT_VERSION}",
        "androidx.hilt:hilt-work:${DependencyVersion.HILT_WORKER_VERSION}"
    )

    val lifecycle = arrayOf(
        "androidx.lifecycle:lifecycle-extensions:${DependencyVersion.LIFECYCLE_EXTENSIONS_VERSION}",
        "androidx.lifecycle:lifecycle-livedata:${DependencyVersion.LIFECYCLE_KTX_VERSION}",
        "androidx.lifecycle:lifecycle-runtime-ktx:${DependencyVersion.LIFECYCLE_KTX_VERSION}",
        "androidx.lifecycle:lifecycle-reactivestreams:${DependencyVersion.LIFECYCLE_KTX_VERSION}",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependencyVersion.VIEWMODEL_KTX_VERSION}",
        "androidx.lifecycle:lifecycle-reactivestreams-ktx:${DependencyVersion.REACTIVESTREAMS_KTX_VERSION}",
    )

    val paging = arrayOf(
        "androidx.paging:paging-common:${DependencyVersion.PAGING_VERSION}",
        "androidx.paging:paging-runtime:${DependencyVersion.PAGING_VERSION}",
    )

    val database = arrayOf(
        "androidx.room:room-runtime:${DependencyVersion.ROOM_VERSION}",
        "androidx.room:room-ktx:${DependencyVersion.ROOM_VERSION}",
    )

    val work = arrayOf(
        "androidx.work:work-runtime-ktx:${DependencyVersion.WORK_MANAGER_VERSION}",
        "androidx.work:work-runtime:${DependencyVersion.WORK_MANAGER_VERSION}"
    )

    val navigation = arrayOf(
        "androidx.navigation:navigation-ui-ktx:${DependencyVersion.NAVIGATION_VERSION}",
        "androidx.navigation:navigation-fragment-ktx:${DependencyVersion.NAVIGATION_VERSION}",
    )

    val playServices = arrayOf(
        "com.google.android.play:core:${DependencyVersion.PLAY_CORE_VERSION}",
        "com.google.android.gms:play-services-location:${DependencyVersion.PLAY_LOCATION_VERSION}",
    )

    val cameraX = arrayOf(
        "androidx.camera:camera-core:${DependencyVersion.CAMERAX_VERSION}",
        "androidx.camera:camera-camera2:${DependencyVersion.CAMERAX_VERSION}",
        "androidx.camera:camera-lifecycle:${DependencyVersion.CAMERAX_VERSION}",
        "androidx.camera:camera-view:${DependencyVersion.CAMERAX_VERSION}",
    )

    val processing = arrayOf(
        "com.google.dagger:hilt-android-compiler:${DependencyVersion.HILT_VERSION}",
        "com.google.dagger:hilt-compiler:${DependencyVersion.HILT_COMPILER_VERSION}",
        "com.github.bumptech.glide:compiler:${DependencyVersion.GLIDE_VERSION}",
        "androidx.room:room-compiler:${DependencyVersion.ROOM_VERSION}",
    )

    val logging = arrayOf(
        "com.jakewharton.timber:timber:${DependencyVersion.TIMBER_VERSION}"
    )

    val unitTesting = arrayOf(
        "junit:junit:${DependencyVersion.JUNIT_VERSION}",
        "androidx.arch.core:core-testing:${DependencyVersion.CORE_TESTING_VERSION}",
        "org.jetbrains.kotlin:kotlin-test-junit:${DependencyVersion.KOTLIN_VERSION}",
        "androidx.test:runner:${DependencyVersion.TEST_RUNNER_VERSION}",
        "androidx.test:rules:${DependencyVersion.TEST_RULES_VERSION}",
        "androidx.annotation:annotation:${DependencyVersion.ANNOTATION_VERSION}         ",
        "org.mockito:mockito-core:${DependencyVersion.MOCKITO_VERSION}",
        "org.mockito.kotlin:mockito-kotlin:${DependencyVersion.MOCKITO_KOTLIN_VERSION}",
        "org.mockito:mockito-inline:${DependencyVersion.MOCKITO_VERSION}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${DependencyVersion.COROUTINES_VERSION}",
        "io.mockk:mockk:${DependencyVersion.MOCKK_VERSION}",
        "io.kotest:kotest-assertions-core:${DependencyVersion.KOTEST_VERSION}",
        "org.powermock:powermock-module-junit4:${DependencyVersion.POWER_MOCK_VERSION}"
    )

    val androidTesting = arrayOf(
        "com.google.dagger:hilt-android-testing:${DependencyVersion.HILT_VERSION}",
        "org.mockito:mockito-android:${DependencyVersion.MOCKITO_VERSION}",
        "androidx.test.espresso:espresso-core:${DependencyVersion.ESPRESSO_VERSION}",
        "androidx.test.espresso:espresso-contrib:${DependencyVersion.ESPRESSO_VERSION}",
        "androidx.test.espresso:espresso-intents:${DependencyVersion.ESPRESSO_VERSION}",
    )

    val devDependencies = arrayOf(
        "com.squareup.leakcanary:leakcanary-android:${DependencyVersion.LEAK_CANARY_VERSION}",
    )
}


