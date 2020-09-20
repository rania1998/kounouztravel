package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.Comment;
import com.pfe.kounouz.travel.service.CommentService;


@RequestMapping
@RestController
public class CommentController {
	

	@Autowired
	private CommentService  CommentService;

	@RequestMapping(value = "/Comment/CommentManager", method = RequestMethod.GET)
	public List<Comment> findAll() {
		return CommentService.findAllComment();
	}

	@RequestMapping(value = "/Comment/CommentById/{id}", method = RequestMethod.GET)
	public Comment getCommenteById(@PathVariable("id") Long id) {
		return CommentService.findOneComment(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Comment/deleteComment")
	public void deleteComment(@RequestBody Comment comment) {
		CommentService.deleteComment(comment);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Comment/saveComment")
	public void saveComment(@RequestBody Comment Comment) {
		CommentService.saveComment(Comment);

	}

}
