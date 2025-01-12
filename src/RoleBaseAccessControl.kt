import entities.Role
import entities.User
import entities.data.hardikFather

class RoleBaseAccessControl {
    private val rolePermission = mapOf(
        Role.PARENT to listOf("Read","View"),
        Role.STUDENT to listOf("Read","View"),
        Role.TEACHER to listOf("View", "Write"),
        Role.CLASS_TEACHER to listOf("Read", "Write", "Modify"),
        Role.ADMIN to listOf("Read", "Write", "Modify", "Create", "Delete")
    )
    fun hasPermission(user: User, permission: String): Boolean{
        return rolePermission[user.role]?.contains(permission) ?: false
    }
}

fun main() {
    val accessControl = RoleBaseAccessControl()
    println(accessControl.hasPermission(hardikFather, "View"))
}