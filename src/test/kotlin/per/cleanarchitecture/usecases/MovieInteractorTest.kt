package per.cleanarchitecture.usecases

import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.mockito.BDDMockito.then
import org.mockito.Mockito.mock
import org.mockito.kotlin.any
import org.mockito.kotlin.times
import per.cleanarchitecture.entities.CommonMovieFactory
import per.cleanarchitecture.entities.MovieFactory

class MovieInteractorTest {
    private val movieFactory: MovieFactory = CommonMovieFactory()
    private val moviePresenter: MoviePresenter = mock(MoviePresenter::class.java)
    private val movieDataSourceGateway: MovieDataSourceGateway = mock(MovieDataSourceGateway::class.java)
    private val movieInteractor = MovieInteractor(movieFactory, moviePresenter, movieDataSourceGateway)

    @Test
    fun `when valid name passed should save and prepare success view`() {
        given(movieDataSourceGateway.existsByName("movie name")).willReturn(false)

        movieInteractor.create(MovieRequestModel("movie name"))

        then(movieDataSourceGateway).should(times(1)).save(any())
        then(moviePresenter).should(times(1)).prepareSuccessView(any())
    }
}