package com.project.ToDo_List.Service;

import com.project.ToDo_List.Repositorios.TaskRepository;
import com.project.ToDo_List.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {


    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    //Buscar todas as tarefas
    public List<Task> getAll() {
        return taskRepository.findAll();
    }
    //Buascar tarefa por id
    public Task getById(Long id){
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }
    //Criar tarefa
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    //Atualizar tarefa
    public Task updateTask(Long id, Task updatedTask) {
        Task task = getById(id);
        task.setTitulo(updatedTask.getTitulo());
        task.setDescricao(updatedTask.getDescricao());
        task.setStatus(updatedTask.getStatus());
        return taskRepository.save(task);
    }
    //Excluir tarefa
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
