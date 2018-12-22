package com.github.aakira.kotlinnativesample.common

expect interface AndroidParcel

@UseExperimental(ExperimentalMultiplatform::class)
@OptionalExpectation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
expect annotation class AndroidParcelize()
