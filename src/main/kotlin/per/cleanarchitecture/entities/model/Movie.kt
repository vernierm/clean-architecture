package per.cleanarchitecture.entities.model

interface Movie {
    val name: String
    fun isNameValid(): Boolean
}