package com.example.onetomany.repository;

import com.example.onetomany.model.Comment;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);
    @Transactional
    void deleteByTutorialId(long tutorialId);
}
