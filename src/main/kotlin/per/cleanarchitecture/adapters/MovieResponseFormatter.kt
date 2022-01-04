package per.cleanarchitecture.adapters

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException
import per.cleanarchitecture.usecases.MoviePresenter
import per.cleanarchitecture.usecases.MovieResponseModel

class MovieResponseFormatter : MoviePresenter {
    override fun prepareSuccessView(model: MovieResponseModel) =
            MovieResponseModel(model.name, model.creationTime)

    override fun prepareFailView(error: String) =
            throw ResponseStatusException(HttpStatus.CONFLICT, error)
}