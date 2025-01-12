package entities

import java.time.LocalDate

class Student(
    firstName: String,
    middleName: String?,
    lastName: String,
    dob: LocalDate,
    gender: String,
    var grade: String,
    var section: Section = Section(),
    var parent: Parent
) : User(firstName, middleName, lastName, dob, gender, Role.STUDENT){

    var height: Float? = null
    var weight: Float? = null
    var bloodGroup: String? = null

    fun updateFirstName(newFirstName: String){
        firstName = newFirstName
    }
    fun updateMiddleName(newMiddleName: String?){
        middleName = newMiddleName
    }
    fun updateLastName(newLastName: String){
        lastName = newLastName
    }

    fun updateDOB(newDate: LocalDate){
        dob = newDate
    }
    fun updateGrade(newGrade: String){
        grade = newGrade
    }
    fun updateSection(newSection: Section){
        section = newSection
    }
    fun modifyParent(newParent: Parent){
        parent = newParent
    }

}