package per.cleanarchitecture.entities

class CommonMovieFactory : MovieFactory {
    override fun createMovie(name: String) = CommonMovie(name)
}