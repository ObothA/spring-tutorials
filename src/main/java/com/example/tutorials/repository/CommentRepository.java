package com.example.tutorials.repository;


import java.util.List;

import com.example.tutorials.model.CommentModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentModel, Long> {
    List<CommentModel> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}
