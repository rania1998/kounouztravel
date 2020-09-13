package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Comment;

public interface CommentService {

	public void deleteCommentaire(Comment Commentaire);

	public List<Comment> findAllCommentaire();

	public Comment findOneCommentaire(Long id);

	public Comment saveCommentaire(Comment Commentaire);

}
