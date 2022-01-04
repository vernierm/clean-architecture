package per.cleanarchitecture.entites

class CommonMovie(override val name: String) : Movie {
    override fun isNameValid() = name.length >= 6
}