package per.cleanarchitecture.entities

interface MovieFactory {
    fun createMovie(name: String): Movie
}