package per.cleanarchitecture.movies

interface MovieFactory {
    fun createMovie(name: String): Movie
}