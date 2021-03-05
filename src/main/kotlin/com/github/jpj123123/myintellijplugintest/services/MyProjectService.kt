package com.github.jpj123123.myintellijplugintest.services

import com.github.jpj123123.myintellijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
