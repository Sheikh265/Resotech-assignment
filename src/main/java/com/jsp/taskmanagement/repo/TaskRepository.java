package com.jsp.taskmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.taskmanagement.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
