package per.cleanarchitecture.entities

import per.cleanarchitecture.entities.model.CommonMovie

class CommonMovieFactory : MovieFactory {
    override fun createMovie(name: String) = CommonMovie(name)
}