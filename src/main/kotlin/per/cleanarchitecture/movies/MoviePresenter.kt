package per.cleanarchitecture.movies

interface MoviePresenter {
    fun prepareSuccessView(movieResponseModel: MovieResponseModel): MovieResponseModel
    fun prepareFailView(error: String)
}