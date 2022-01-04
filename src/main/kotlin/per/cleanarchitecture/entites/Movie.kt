package per.cleanarchitecture.entites

interface Movie {
    val name: String
    fun isNameValid(): Boolean
}