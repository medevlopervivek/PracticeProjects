package entities.data

import entities.Grade
import entities.Section

fun createClassWithSections(className: String, sectionNames: MutableSet<Section>): Grade {
    return Grade(className, sectionNames)
}