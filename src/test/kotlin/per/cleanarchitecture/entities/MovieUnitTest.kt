package per.cleanarchitecture.entities

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import per.cleanarchitecture.entities.model.CommonMovie

class MovieUnitTest {
    @Test
    fun `movie name should be at least 6 chars long`() {
        val movie = CommonMovie("abc")
        assertFalse(movie.isNameValid())
    }
}