package com.github.relumal2ford.fordandroidmvvmplugin.services

import com.github.relumal2ford.fordandroidmvvmplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
