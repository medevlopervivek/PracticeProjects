package entities

import java.time.LocalDate
import java.time.Period
import java.util.*

enum class Role {
    STUDENT,
    PARENT,
    TEACHER,
    CLASS_TEACHER,
    ADMIN

}

open class User(
    var firstName: String,
    var middleName: String?,
    var lastName: String,
    var dob: LocalDate,
    var gender: String,
    val role: Role
) {
    fun calculateAge(): Int {
        return Period.between(dob, LocalDate.now()).years
    }
}