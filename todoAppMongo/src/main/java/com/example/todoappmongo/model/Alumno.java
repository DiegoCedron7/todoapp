package com.example.todoappmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "alumnos")
@Data
public class Alumno {
    @Id
    private String id;
    @Field("nombre")
    private String nombre;

    @Field("apellido")
    private String apellido;
    @Field("edad")
    private int edad;
    @Field("direccion")
    private String direccion;
}
