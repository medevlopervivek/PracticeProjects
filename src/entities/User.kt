package entities

import java.util.*

enum class Role{
    STUDENT,
    PARENT,
    TEACHER,
    CLASS_TEACHER

}

open class User(
    val firstName: String,
    val middleName: String?,
    val lastName: String,
    val dob: Date,
    val gender: String,
    val role: Role
)