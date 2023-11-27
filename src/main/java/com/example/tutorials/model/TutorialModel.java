package com.example.tutorials.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name= "tutorials")
@Getter
@Setter
//@RequiredArgsConstructor(staticName = "of")
//@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class TutorialModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    @NotBlank(message = "Title is required.")
    @Size(min = 3, max = 20, message = "Title must be between 3 and 20 characters.")
    private String title;

    @Column(name = "description")
    @NotBlank(message = "description is required.")
    private String description;

    @Column(name = "published")
    private boolean published;

    public TutorialModel(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public TutorialModel() {

    }
}
