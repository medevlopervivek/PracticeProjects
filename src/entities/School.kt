package entities

import RoleBaseAccessControl
import entities.data.school
import entities.data.vikram

class School(
    val name: String,
    private val address: String,
    private val admin: Admin = vikram
) {
    private val students = mutableListOf<Student>()
    private val teachers = mutableListOf<Teacher>()

    private val accessControl = RoleBaseAccessControl()

    init {
        schoolInfo()
    }

    fun addStudent(student: Student, by: User): Boolean {
        if (accessControl.hasPermission(by, permission = "Create")) {
            if (!students.contains(student)) {
                students.add(student)
                println("Student ${student.firstName} added by ${by.firstName}(${by.role})")
                return true
            } else {
                println("$student is already added.")
                return false
            }
        } else {
            println("${by.firstName} (${by.role}) has not permission to add a student.")
            return false
        }
    }

    fun removeStudent(student: Student, by: User): Boolean {
        if (accessControl.hasPermission(user = by, permission = "Delete")) {
            if (students.contains(student)) {
                students.remove(student)
                println("Student ${student.firstName} removed by ${by.firstName}(${by.role})")
                return true
            } else {
                println("${student.firstName} not found.")
                return false
            }
        } else {
            println("${by.firstName} (${by.role}) has not permission to remove student from school")
            return false
        }

    }

    fun addTeacher(teacher: Teacher, by: User): Boolean {
        if (accessControl.hasPermission(user = by, "Create")) {
            if (!teachers.contains(teacher)) {
                teachers.add(teacher)
                println("Teacher added: ${teacher.firstName} ${teacher.lastName}")
                return true
            } else {
                println("${teacher.firstName} is all ready added.")
                return false
            }

        } else {
            println("${by.firstName}(${by.role}) has not permission to add new teacher.")
            return false
        }
    }

    fun removeTeacher(teacher: Teacher, by: User): Boolean {
        if (accessControl.hasPermission(user = by, permission = "Delete")) {
            if (teachers.contains(teacher)) {
                school.removeTeacher(teacher = teacher, by = by)
                println("Teacher ${teacher.firstName} removed by ${by.firstName}(${by.role})")
                return true
            } else {
                println("${teacher.firstName} is not found.")
                return false
            }
        } else {
            println("${by.firstName}(${by.role}) has permission to remove teacher from school")
            return false
        }
    }

    fun getAllStudents(): List<Student> = students

    fun getAllTeachers(): List<Teacher> = teachers

    fun addSubjectToTeacher(teacher: Teacher, subject: Subject, by: User): Boolean {
        if (accessControl.hasPermission(user = by, permission = "Modify")) {
            if (!teacher.subjects.contains(subject)){
                teacher.addSubject(subject)
                return true
            }
            else{
                println("$subject is already added to teacher.")
                return false
            }
        } else {
            println("${by.firstName}(${by.role}) has not permission.")
            return false
        }
    }

    fun schoolInfo() {
        println("School name: $name Address: $address")
        println("Admin: ${admin.firstName}")
        println("No of Student: ${students.size}")
        println("No of Teacher: ${teachers.size}")
    }
}