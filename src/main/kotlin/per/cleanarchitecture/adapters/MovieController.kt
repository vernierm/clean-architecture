package per.cleanarchitecture.adapters

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import per.cleanarchitecture.usecases.MovieBoundary
import per.cleanarchitecture.usecases.MovieRequestModel
import per.cleanarchitecture.usecases.MovieResponseModel

@RestController
class MovieController(private val movieBoundary: MovieBoundary) {
    @PostMapping("/movie")
    fun create(@RequestBody request: MovieRequestModel): MovieResponseModel = movieBoundary.create(request)

    @GetMapping("/movies")
    fun getAll(): List<MovieResponseModel> = movieBoundary.getAll()
}