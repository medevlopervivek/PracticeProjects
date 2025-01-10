package entities

import java.util.*

class Father(
    firstName: String,
    middleName: String?,
    lastName: String,
    dob: Date
): User(firstName, middleName, lastName, dob, "Male", Role.PARENT)

class Mother(
    firstName: String,
    middleName: String?,
    lastName: String,
    dob: Date
): User(firstName, middleName, lastName, dob, "Female", Role.PARENT)

class Parent(
    val father: Father,
    val mother: Mother,
)