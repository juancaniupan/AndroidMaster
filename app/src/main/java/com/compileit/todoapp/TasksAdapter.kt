package com.compileit.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.compileit.androidmaster.R

class TasksAdapter(private val tasks: List<Task>): RecyclerView.Adapter<TasksVewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksVewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)

        return TasksVewHolder(view)
    }

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: TasksVewHolder, position: Int) {
        holder.render(tasks[position])
    }
}