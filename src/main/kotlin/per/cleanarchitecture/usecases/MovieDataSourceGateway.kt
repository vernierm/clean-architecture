package per.cleanarchitecture.usecases

import java.time.LocalDateTime

class MovieDataSourceModel(val name: String, val creationTime: LocalDateTime)

interface MovieDataSourceGateway {
    fun existsByName(name: String): Boolean
    fun save(request: MovieDataSourceModel)
    fun findAll(): List<MovieDataSourceModel>
}
