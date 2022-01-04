package per.cleanarchitecture.adapters

import per.cleanarchitecture.usecases.MovieDataSourceGateway
import per.cleanarchitecture.usecases.MovieDataSourceModel

class JpaMovieGateway(private val repo: JpaMovieRepository) : MovieDataSourceGateway {
    override fun existsByName(name: String) = repo.findByName(name) != null

    override fun save(request: MovieDataSourceModel) {
        repo.save(MovieDataMapper(0, request.name, request.creationTime))
    }

    override fun findAll() =
            repo.findAll().map { MovieDataSourceModel(it.name, it.creationDate) }
}