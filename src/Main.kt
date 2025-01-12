import entities.data.*


fun main() {

    school.addStudent(student = vidhi, by = vikram)
    school.addStudent(student = hardik, by = vikram)
    school.addStudent(student = sneha, by = vikram)
    school.getAllStudents().forEach {
        println("${it.firstName} ${it.parent.father.firstName}")
    }
    school.removeStudent(hardik, by = soniAcharya)
    school.getAllStudents().forEach {
        println("${it.firstName} ${it.parent.father.firstName}")
    }
    println("-----------------------------------------")
    school.schoolInfo()
    school.removeStudent(hardik, by = vikram)
    school.getAllStudents().forEach {
        println("${it.firstName} ${it.parent.father.firstName}")
    }
    school.schoolInfo()
    school.addStudent(suman, by = vikram)
    school.schoolInfo()
    school.getAllStudents().forEach {
        println("${it.firstName} ${it.parent.father.firstName}")
    }
}