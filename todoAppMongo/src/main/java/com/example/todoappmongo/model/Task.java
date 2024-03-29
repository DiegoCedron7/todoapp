package com.example.todoappmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "tasks")
@Data //Use to create automated getters & setters
public class Task {
    @Id
    private String id;

    @Field("title")
    private String title;

    @Field("completed")
    private boolean completed;
}
