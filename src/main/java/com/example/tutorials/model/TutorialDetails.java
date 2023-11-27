package com.example.tutorials.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tutorial_details")
@Setter
@Getter
public class TutorialDetails {
    @Id
    private Long id;

    @Column
    private Date createdOn;

    @Column
    private String createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId // makes id field serve as both primary key and foreign key
    @JoinColumn(name = "tutorial_id") // shared primary key column name
    private TutorialModel tutorial;

    public TutorialDetails() {
    }

    public TutorialDetails(String createdBy) {
        this.createdOn = new Date();
        this.createdBy = createdBy;
    }
}
