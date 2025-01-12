package entities

class Grade(
    name: String,
    sections: MutableSet<Section> = mutableSetOf()
)