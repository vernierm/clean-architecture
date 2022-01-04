package per.cleanarchitecture.entities

interface Movie {
    val name: String
    fun isNameValid(): Boolean
}