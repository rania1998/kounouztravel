package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Comment;
import com.pfe.kounouz.travel.repository.CommentRepository;
import com.pfe.kounouz.travel.service.CommentService;

@Service
public class CommentServiceImpl implements  CommentService{

	@Autowired
    CommentRepository CommentRepository ;
	@Override
	public void deleteComment(Comment Comment) {
		CommentRepository.delete(Comment);
		
	}


	@Override
	public Comment findOneComment(Long id) {
		return CommentRepository.findCommentById(id);
	}

	@Override
	public Comment saveComment(Comment Comment) {
		return  CommentRepository.save(Comment);
	}

	@Override
	public List<Comment> findAllComment() {
		// TODO Auto-generated method stub
		return CommentRepository.findAll();
	}


	

}
