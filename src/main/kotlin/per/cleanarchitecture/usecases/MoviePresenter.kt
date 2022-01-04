package per.cleanarchitecture.usecases

interface MoviePresenter {
    fun prepareSuccessView(movieResponseModel: MovieResponseModel): MovieResponseModel
    fun prepareFailView(error: String)
}