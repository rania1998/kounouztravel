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
    CommentRepository CommentaireRepository ;
	@Override
	public void deleteCommentaire(Comment Commentaire) {
		CommentaireRepository.delete(Commentaire);
		
	}

	@Override
	public List<Comment> findAllCommentaire() {
		return CommentaireRepository.findAll();
	}

	@Override
	public Comment findOneCommentaire(Long id) {
		return CommentaireRepository.findCommentaireById(id);
	}

	@Override
	public Comment saveCommentaire(Comment Commentaire) {
		return  CommentaireRepository.save(Commentaire);
	}


	

}
