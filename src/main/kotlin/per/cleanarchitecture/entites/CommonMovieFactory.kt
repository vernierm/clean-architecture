package per.cleanarchitecture.entites

class CommonMovieFactory : MovieFactory {
    override fun createMovie(name: String) = CommonMovie(name)
}