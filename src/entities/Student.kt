package entities

import java.util.*

class Student(
    firstName: String,
    middleName: String?,
    lastName: String,
    dob: Date,
    gender: String,
    val grade: Int,
    val parent: Parent,

    ): User(firstName, middleName, lastName, dob, gender, Role.STUDENT)