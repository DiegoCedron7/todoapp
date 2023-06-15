package com.example.todoappmongo.repository;

import com.example.todoappmongo.model.Alumno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlumnoRepository extends MongoRepository<Alumno, String> {
}

