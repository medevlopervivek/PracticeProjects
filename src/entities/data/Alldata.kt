package entities.data

import entities.*
import java.time.LocalDate


val vikram = Admin(
    firstName = "Vikram",
    middleName = "Bahadur",
    lastName = "BK",
    dob = LocalDate.now(),
    gender = "Male",
    role = Role.ADMIN
)
val school = School(name = "Sungabha", "Sainamaina-3")

val hardikFather = Father(
    firstName = "Hemant", middleName = null, lastName = "Gahatraj", dob = LocalDate.now()
)
val hardikMother = Mother(firstName = "Kusum", middleName = null, lastName = "Gahatraj", dob = LocalDate.now())
val hardikParent = Parent(father = hardikFather, mother = hardikMother)

val hardik = Student(
    firstName = "Hardik",
    middleName = null,
    lastName = "Gahatraj",
    dob = LocalDate.now(),
    gender = "Male",
    grade = "PG",
    parent = hardikParent
)

val vidhiFather = Father(firstName = "Vivek", middleName = null, lastName = "Vishwakarma", dob = LocalDate.now())
val vidhiMother = Mother(
    firstName = "Soni",
    middleName = null,
    lastName = "Sunar",
    dob = LocalDate.now()
)
val vidhiParent = Parent(vidhiFather, vidhiMother)
val vidhi = Student(
    firstName = "Vidhi",
    middleName = null,
    lastName = "Sunar",
    dob = LocalDate.now(),
    gender = "Female",
    grade = "SKG",
    parent = vidhiParent
)


val snehaFather = Father(
    firstName = "Ishwor",
    middleName = null,
    lastName = "Ghatane",
    dob = LocalDate.now()
)
val snehaMother = Mother(
    firstName = "Sita",
    middleName = null,
    lastName = "Ghatane",
    dob = LocalDate.now()
)
val snehaParent = Parent(snehaFather, snehaMother)

val sneha = Student(
    firstName = "Sneha",
    middleName = null,
    lastName = "Ghatane",
    dob = LocalDate.now(),
    gender = "Female",
    grade = "9",
    parent = snehaParent
)
val sumanFather = Father(
    firstName = "Ram",
    middleName = "Bahadur",
    lastName = "Thapa",
    dob = LocalDate.now()
)
val sumanMother = Mother(
    firstName = "Saraswati",
    middleName = null,
    lastName = "Thapa",
    dob = LocalDate.now()
)
val sumanParent = Parent(sumanFather, sumanMother)

val suman = Student(
    firstName = "Suman",
    middleName = "Raj",
    lastName = "Thapa",
    dob = LocalDate.now(),
    gender = "Male",
    grade = "10",
    parent = sumanParent
)

val sitaFather = Father(
    firstName = "Hari",
    middleName = "Prasad",
    lastName = "Karki",
    dob = LocalDate.now()
)
val sitaMother = Mother(
    firstName = "Ganga",
    middleName = null,
    lastName = "Karki",
    dob = LocalDate.now()
)
val sitaParent = Parent(sitaFather, sitaMother)

val sita = Student(
    firstName = "Sita",
    middleName = "Kumari",
    lastName = "Karki",
    dob = LocalDate.now(),
    gender = "Female",
    grade = "8",
    parent = sitaParent
)

val rohanFather = Father(
    firstName = "Bikash",
    middleName = "Chandra",
    lastName = "Rai",
    dob = LocalDate.now()
)
val rohanMother = Mother(
    firstName = "Maya",
    middleName = null,
    lastName = "Rai",
    dob = LocalDate.now()
)
val rohanParent = Parent(rohanFather, rohanMother)

val rohan = Student(
    firstName = "Rohan",
    middleName = "Bikram",
    lastName = "Rai",
    dob = LocalDate.now(),
    gender = "Male",
    grade = "7",
    parent = rohanParent
)

val nishaFather = Father(
    firstName = "Krishna",
    middleName = "Nath",
    lastName = "Sharma",
    dob = LocalDate.now()
)
val nishaMother = Mother(
    firstName = "Radha",
    middleName = null,
    lastName = "Sharma",
    dob = LocalDate.now()
)
val nishaParent = Parent(nishaFather, nishaMother)

val nisha = Student(
    firstName = "Nisha",
    middleName = "Laxmi",
    lastName = "Sharma",
    dob = LocalDate.now(),
    gender = "Female",
    grade = "9",
    parent = nishaParent
)

val anishFather = Father(
    firstName = "Dinesh",
    middleName = "Man",
    lastName = "Gurung",
    dob = LocalDate.now()
)
val anishMother = Mother(
    firstName = "Kusum",
    middleName = null,
    lastName = "Gurung",
    dob = LocalDate.now()
)
val anishParent = Parent(anishFather, anishMother)

val anish = Student(
    firstName = "Anish",
    middleName = null,
    lastName = "Gurung",
    dob = LocalDate.now(),
    gender = "Male",
    grade = "6",
    parent = anishParent
)

// Creating Parents and Students
val AaravFather = Father(firstName = "Ramesh", middleName = null, lastName = "Sharma", dob = LocalDate.of(1980, 1, 1))
val AaravMother = Mother(firstName = "Sita", middleName = null, lastName = "Sharma", dob = LocalDate.of(1982, 2, 2))
val AaravParent = Parent(father = AaravFather, mother = AaravMother)
val Aarav = Student(
    firstName = "Aarav", middleName = null, lastName = "Sharma",
    dob = LocalDate.of(2015, 1, 1), gender = "Male",
    grade = "Grade 1", parent = AaravParent
)

val IshikaFather = Father(firstName = "Suresh", middleName = null, lastName = "Thapa", dob = LocalDate.of(1978, 3, 3))
val IshikaMother = Mother(firstName = "Meera", middleName = null, lastName = "Thapa", dob = LocalDate.of(1980, 4, 4))
val IshikaParent = Parent(father = IshikaFather, mother = IshikaMother)
val Ishika = Student(
    firstName = "Ishika", middleName = null, lastName = "Thapa",
    dob = LocalDate.of(2016, 3, 3), gender = "Female",
    grade = "Grade 2", parent = IshikaParent
)

val VivaanFather = Father(firstName = "Rajesh", middleName = null, lastName = "Singh", dob = LocalDate.of(1975, 5, 5))
val VivaanMother = Mother(firstName = "Kiran", middleName = null, lastName = "Singh", dob = LocalDate.of(1976, 6, 6))
val VivaanParent = Parent(father = VivaanFather, mother = VivaanMother)
val Vivaan = Student(
    firstName = "Vivaan", middleName = null, lastName = "Singh",
    dob = LocalDate.of(2014, 5, 5), gender = "Male",
    grade = "Grade 3", parent = VivaanParent
)

val RiyaFather = Father(firstName = "Prakash", middleName = null, lastName = "Yadav", dob = LocalDate.of(1985, 7, 7))
val RiyaMother = Mother(firstName = "Sunita", middleName = null, lastName = "Yadav", dob = LocalDate.of(1987, 8, 8))
val RiyaParent = Parent(father = RiyaFather, mother = RiyaMother)
val Riya = Student(
    firstName = "Riya", middleName = null, lastName = "Yadav",
    dob = LocalDate.of(2013, 7, 7), gender = "Female",
    grade = "Grade 4", parent = RiyaParent
)

val AdityaFather = Father(firstName = "Kamal", middleName = null, lastName = "Chaudhary", dob = LocalDate.of(1982, 9, 9))
val AdityaMother = Mother(firstName = "Anju", middleName = null, lastName = "Chaudhary", dob = LocalDate.of(1983, 10, 10))
val AdityaParent = Parent(father = AdityaFather, mother = AdityaMother)
val Aditya = Student(
    firstName = "Aditya", middleName = null, lastName = "Chaudhary",
    dob = LocalDate.of(2015, 9, 9), gender = "Male",
    grade = "Grade 5", parent = AdityaParent
)

val KavyaFather = Father(firstName = "Mahesh", middleName = null, lastName = "Gupta", dob = LocalDate.of(1981, 11, 11))
val KavyaMother = Mother(firstName = "Radha", middleName = null, lastName = "Gupta", dob = LocalDate.of(1982, 12, 12))
val KavyaParent = Parent(father = KavyaFather, mother = KavyaMother)
val Kavya = Student(
    firstName = "Kavya", middleName = null, lastName = "Gupta",
    dob = LocalDate.of(2016, 11, 11), gender = "Female",
    grade = "Grade 6", parent = KavyaParent
)

val ArjunFather = Father(firstName = "Narayan", middleName = null, lastName = "Karki", dob = LocalDate.of(1980, 2, 2))
val ArjunMother = Mother(firstName = "Asha", middleName = null, lastName = "Karki", dob = LocalDate.of(1983, 3, 3))
val ArjunParent = Parent(father = ArjunFather, mother = ArjunMother)
val Arjun = Student(
    firstName = "Arjun", middleName = null, lastName = "Karki",
    dob = LocalDate.of(2014, 2, 2), gender = "Male",
    grade = "Grade 7", parent = ArjunParent
)

val NidhiFather = Father(firstName = "Ganesh", middleName = null, lastName = "Mishra", dob = LocalDate.of(1978, 1, 1))
val NidhiMother = Mother(firstName = "Rita", middleName = null, lastName = "Mishra", dob = LocalDate.of(1980, 2, 2))
val NidhiParent = Parent(father = NidhiFather, mother = NidhiMother)
val Nidhi = Student(
    firstName = "Nidhi", middleName = null, lastName = "Mishra",
    dob = LocalDate.of(2015, 1, 1), gender = "Female",
    grade = "Grade 8", parent = NidhiParent
)

val RohanFather = Father(firstName = "Bijay", middleName = null, lastName = "Rana", dob = LocalDate.of(1985, 3, 3))
val RohanMother = Mother(firstName = "Usha", middleName = null, lastName = "Rana", dob = LocalDate.of(1987, 4, 4))
val RohanParent = Parent(father = RohanFather, mother = RohanMother)
val Rohan = Student(
    firstName = "Rohan", middleName = null, lastName = "Rana",
    dob = LocalDate.of(2016, 3, 3), gender = "Male",
    grade = "Grade 9", parent = RohanParent
)

val MeghaFather = Father(firstName = "Harish", middleName = null, lastName = "Joshi", dob = LocalDate.of(1980, 5, 5))
val MeghaMother = Mother(firstName = "Kumari", middleName = null, lastName = "Joshi", dob = LocalDate.of(1982, 6, 6))
val MeghaParent = Parent(father = MeghaFather, mother = MeghaMother)
val Megha = Student(
    firstName = "Megha", middleName = null, lastName = "Joshi",
    dob = LocalDate.of(2013, 5, 5), gender = "Female",
    grade = "Grade 10", parent = MeghaParent
)
