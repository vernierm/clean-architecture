package per.cleanarchitecture.entites

interface MovieFactory {
    fun createMovie(name: String): Movie
}