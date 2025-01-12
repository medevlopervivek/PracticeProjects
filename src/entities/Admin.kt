package entities

import java.time.LocalDate

class Admin(
    firstName: String,
    middleName: String?,
    lastName: String,
    dob: LocalDate,
    gender: String,
    role: Role
) : User(firstName, middleName, lastName,
    dob,
    gender,
    role= Role.ADMIN
)

/**
 * Later I will add types of admin such as SuperAdmin, SchoolAdmin etc.
 */