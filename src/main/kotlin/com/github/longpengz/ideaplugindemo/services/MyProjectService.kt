package com.github.longpengz.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.longpengz.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
