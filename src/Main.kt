import entities.*
import java.util.Date

fun main() {
    val m = Mother("Soni", null, "Sunar", Date())
    val f = Father("Vivek", null, "Vishwakarma", Date())
    val parent = Parent(mother = m, father = f)
    val student = Student(
        firstName = "Vidhi",
        middleName = null,
        lastName = "Sunar",
        dob = Date(),
        gender = "Female",
        grade = 1,
        parent = parent
    )
    println("${student.firstName} ${student.lastName}(${student.role})\n")
    println("Father name: ${parent.father.firstName} Gender: ${parent.father.gender} Role: ${parent.father.role}")
    println("Mother name: ${parent.mother.firstName} Gender: ${parent.mother.gender} Role: ${parent.mother.role}")

}