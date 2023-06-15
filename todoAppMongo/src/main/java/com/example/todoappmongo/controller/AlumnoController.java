package com.example.todoappmongo.controller;

import com.example.todoappmongo.model.Alumno;
import com.example.todoappmongo.repository.AlumnoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    private final AlumnoRepository alumnoRepository;

    public AlumnoController(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }


    @GetMapping()
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Alumno getAlumnoById(@PathVariable String id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Alumno createAlumno(@RequestBody Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @PutMapping("/{id}")
    public Alumno updateTask(@PathVariable String id, @RequestBody Alumno alumno) {
        alumno.setId(id);
        return alumnoRepository.save(alumno);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        Optional<Alumno> existingAlumno = alumnoRepository.findById(id);
        if (existingAlumno.isPresent()) {
            alumnoRepository.deleteById(id);
        }
    }
}
