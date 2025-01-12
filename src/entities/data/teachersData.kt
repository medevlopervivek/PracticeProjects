package entities.data

import entities.Teacher
import java.time.LocalDate

val soniAcharya = Teacher(
    firstName = "Soni",
    middleName = null,
    lastName = "Acharya",
    dob = LocalDate.now(),
    gender = "Female"
)