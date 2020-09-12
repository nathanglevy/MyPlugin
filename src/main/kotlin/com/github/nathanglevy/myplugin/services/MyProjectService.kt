package com.github.nathanglevy.myplugin.services

import com.intellij.openapi.project.Project
import com.github.nathanglevy.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
