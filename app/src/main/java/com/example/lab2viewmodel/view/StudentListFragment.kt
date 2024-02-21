package com.example.lab2viewmodel.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2viewmodel.R
import com.example.lab2viewmodel.databinding.ActivityMainBinding
import com.example.lab2viewmodel.databinding.FragmentStudentListBinding
import com.example.lab2viewmodel.viewmodel.StudentListViewModel

private  const val TAG="StudentListFragment"

class StudentListFragment:Fragment(R.layout.fragment_student_list) {
    private  lateinit var binding: FragmentStudentListBinding

    private  val studentListViewModel:StudentListViewModel by lazy {
        ViewModelProvider(this)[StudentListViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Total students:${studentListViewModel.students.size}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStudentListBinding.inflate(layoutInflater,
            container, false)
        binding.studentRecyclerView.layoutManager=LinearLayoutManager(context)
        return binding.root
    }

    private inner class StudentHolder(view:View):RecyclerView.ViewHolder(view){

    }
    companion object{
        fun newInstance():StudentListFragment{
            return StudentListFragment()
        }
    }
}