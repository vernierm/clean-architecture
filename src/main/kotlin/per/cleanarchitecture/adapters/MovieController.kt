package per.cleanarchitecture.adapters

import com.fasterxml.jackson.annotation.JsonCreator
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import per.cleanarchitecture.usecases.MovieBoundary
import per.cleanarchitecture.usecases.MovieRequestModel
import per.cleanarchitecture.usecases.MovieResponseModel

@RestController
class MovieController(private val movieBoundary: MovieBoundary) {
    data class JsonMovieRequestModel @JsonCreator constructor(val name: String)

    @PostMapping("/movie")
    fun create(@RequestBody request: JsonMovieRequestModel) =
            movieBoundary.create(MovieRequestModel(request.name))

    @GetMapping("/movies")
    fun getAll(): List<MovieResponseModel> = movieBoundary.getAll()
}