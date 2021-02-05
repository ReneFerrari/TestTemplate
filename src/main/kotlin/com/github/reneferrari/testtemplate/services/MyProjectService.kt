package com.github.reneferrari.testtemplate.services

import com.github.reneferrari.testtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
