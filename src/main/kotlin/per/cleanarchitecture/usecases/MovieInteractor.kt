package per.cleanarchitecture.usecases

import per.cleanarchitecture.entites.MovieFactory
import java.time.LocalDateTime

class MovieInteractor(
        private val movieFactory: MovieFactory,
        private val moviePresenter: MoviePresenter,
        private val movieDataSourceGateway: MovieDataSourceGateway
) : MovieBoundary {
    override fun create(request: MovieRequestModel): MovieResponseModel {
        val name = request.name
        if (movieDataSourceGateway.existsByName(name))
            moviePresenter.prepareFailView("movie already exists")

        val movie = movieFactory.createMovie(name)
        if (movie.isNameValid().not())
            moviePresenter.prepareFailView("movie name not valid")

        val now = LocalDateTime.now()
        movieDataSourceGateway.save(MovieDataSourceModel(name, now))

        return moviePresenter.prepareSuccessView(MovieResponseModel(name, now.toString()))
    }

    override fun getAll() = movieDataSourceGateway.findAll().map {
        moviePresenter.prepareSuccessView(MovieResponseModel(it.name, it.creationTime.toString()))
    }
}