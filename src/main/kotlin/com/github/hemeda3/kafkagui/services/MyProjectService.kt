package com.github.hemeda3.kafkagui.services

import com.github.hemeda3.kafkagui.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
