package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Comment;

public interface CommentService {

	public void deleteComment(Comment Comment);

	public List<Comment> findAllComment();

	public Comment findOneComment(Long id);

	public Comment saveComment(Comment Comment);

}
