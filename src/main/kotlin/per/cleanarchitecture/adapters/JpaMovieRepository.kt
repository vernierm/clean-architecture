package per.cleanarchitecture.adapters

import org.springframework.data.jpa.repository.JpaRepository

interface JpaMovieRepository : JpaRepository<MovieDataMapperModel, Int> {
    fun findByName(name: String): MovieDataMapperModel?
}