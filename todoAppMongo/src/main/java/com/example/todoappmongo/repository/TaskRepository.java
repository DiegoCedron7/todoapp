package com.example.todoappmongo.repository;

import com.example.todoappmongo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
