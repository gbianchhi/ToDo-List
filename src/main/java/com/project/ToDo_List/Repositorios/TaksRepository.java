package com.project.ToDo_List.Repositorios;

import com.project.ToDo_List.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaksRepository extends JpaRepository<Task,Long> {
}
