package per.cleanarchitecture.movies

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class MovieUnitTest {
    @Test
    fun `movie name should be at least 6 chars long`() {
        val movie = CommonMovie("abc")
        assertFalse(movie.isNameValid())
    }
}