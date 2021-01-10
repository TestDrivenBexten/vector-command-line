package myvector

data class KotlinVector(val a: Int, val b: Int)

fun combineVectors(vector1: KotlinVector, vector2: KotlinVector): KotlinVector {
    return KotlinVector(vector1.a + vector2.a,vector1.b + vector2.b)
}