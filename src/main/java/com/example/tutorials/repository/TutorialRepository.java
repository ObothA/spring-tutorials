package com.example.tutorials.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.tutorials.model.TutorialModel;

public interface TutorialRepository extends JpaRepository<TutorialModel, Long> {
    Page<TutorialModel> findByPublished(boolean published, Pageable pageable);
    Page<TutorialModel> findByTitleContaining(String title, Pageable pageable);
}
