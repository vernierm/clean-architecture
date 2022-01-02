package per.cleanarchitecture.movies

class MovieRequestModel(val name: String)
class MovieResponseModel(val name: String, val creationTime: String)

interface MovieBoundary {
    fun create(request: MovieRequestModel): MovieResponseModel
    fun getAll(): List<MovieResponseModel>
}
