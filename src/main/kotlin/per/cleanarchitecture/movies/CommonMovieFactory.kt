package per.cleanarchitecture.movies

class CommonMovieFactory : MovieFactory {
    override fun createMovie(name: String) = CommonMovie(name)
}