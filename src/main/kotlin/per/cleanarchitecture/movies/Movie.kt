package per.cleanarchitecture.movies

interface Movie {
    val name: String
    fun isNameValid(): Boolean
}