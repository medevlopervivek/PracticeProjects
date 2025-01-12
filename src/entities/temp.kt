package entities

// Role Enum
/*enum class Role {
    TEACHER,
    ADMIN
}

// User Base Class
open class User(
    val firstName: String,
    val middleName: String?,
    val lastName: String,
    val dob: Date,
    val gender: String,
    val role: Role
)

// Student Class
class Student(
    private var firstName: String,
    private var middleName: String?,
    private var lastName: String,
    val dob: Date,
    private var gender: String,
    private var grade: String,
    private var parent: Parent?
) {
    fun updateName(newFirstName: String, newMiddleName: String?, newLastName: String, by: User) {
        if (by.role == Role.TEACHER) {
            println("Teacher ${by.firstName} is changing the student's name.")
        } else if (by.role == Role.ADMIN) {
            println("Admin ${by.firstName} is changing the student's name.")
        } else {
            throw IllegalAccessException("Only TEACHER or ADMIN can update student details.")
        }
        this.firstName = newFirstName
        this.middleName = newMiddleName
        this.lastName = newLastName
    }

    override fun toString(): String {
        return "Student(firstName='$firstName', middleName=$middleName, lastName='$lastName')"
    }
}

// Teacher Class
class Teacher(
    firstName: String,
    middleName: String?,
    lastName: String,
    dob: Date,
    gender: String,
) : User(firstName, middleName, lastName, dob, gender, Role.TEACHER) {

    fun changeStudentName(student: Student, newFirstName: String, newMiddleName: String?, newLastName: String) {
        student.updateName(newFirstName, newMiddleName, newLastName, this)
    }
}
*/