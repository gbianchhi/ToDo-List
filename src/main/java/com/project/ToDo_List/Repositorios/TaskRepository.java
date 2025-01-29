package com.project.ToDo_List.Repositorios;

import com.project.ToDo_List.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//responsavel pela interação com o banco de dados
public interface TaskRepository extends JpaRepository<Task,Long> {
}
