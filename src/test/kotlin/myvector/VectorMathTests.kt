package myvector

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VectorMathTests {
    @Test
    fun `Adding vectors (1,2) and (3,4) should return (4,6)`(){
        val vector1 = KotlinVector(1,2)
        val vector2 = KotlinVector(3,4)
        val combinedVector = combineVectors(vector1, vector2)
        assertEquals(KotlinVector(4,6), combinedVector)
    }
}