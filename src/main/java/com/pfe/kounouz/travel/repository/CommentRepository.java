package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	Comment findCommentById(long id);

}
