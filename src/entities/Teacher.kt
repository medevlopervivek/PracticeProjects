package entities

import java.time.LocalDate

class Teacher(
    firstName: String = "DefaultFirstName",
    middleName: String? = null,
    lastName: String = "DefaultLastName",
    dob: LocalDate= LocalDate.now(),
    gender: String = "Unknown",
    val subjects: MutableSet<Subject> = mutableSetOf()
): User(firstName, middleName, lastName, dob, gender, Role.TEACHER){

    fun updateStudentDetail(student: Student, updateAction: Student.() ->Unit){
        student.updateAction()
    }
    fun addSubject(subject: Subject){
        if (subject !in subjects){
            subjects.add(subject)
        }
    }
}