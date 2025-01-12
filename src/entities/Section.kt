package entities

class Section(
    val sectionName: String="Sun",
    val students: MutableSet<Student> = mutableSetOf(),
    val classTeacher: Teacher = Teacher()
) {
}