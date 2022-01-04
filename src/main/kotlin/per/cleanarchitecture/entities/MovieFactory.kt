package per.cleanarchitecture.entities

import per.cleanarchitecture.entities.model.Movie

interface MovieFactory {
    fun createMovie(name: String): Movie
}