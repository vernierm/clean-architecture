package per.cleanarchitecture.adapters

import org.springframework.data.jpa.repository.JpaRepository

interface JpaMovieRepository : JpaRepository<MovieDataMapper, Int> {
    fun findByName(name: String): MovieDataMapper?
}