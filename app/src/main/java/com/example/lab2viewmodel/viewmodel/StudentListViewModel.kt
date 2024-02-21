package com.example.lab2viewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.example.lab2viewmodel.model.Student

class StudentListViewModel:ViewModel() {
    val students = mutableListOf<Student>();
    init {
        students.add(Student("Ivanov","20-isp-1",
            2008,4,3,5))
        students.add(Student("Petrov","20-isp-2",
            2007,5,4,4))
        students.add(Student("Zaxarov","20-isp-1",
            2008,3,5,5))
    }
}