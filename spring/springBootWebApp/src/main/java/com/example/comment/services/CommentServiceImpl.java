package com.example.comment.services;

import com.example.comment.domain.Comment;
import com.example.comment.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HSH on 2016. 1. 15..
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Iterable<Comment> listAllcomments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getCommentById(Integer id) {
        return commentRepository.findOne(id);
    }

    @Override
    public List<Comment> findByStudyId(Integer studyId) {
        int length = commentRepository.findByStudyId(studyId).size();
        if(length > 10)
            length = 10;
        List<Comment> viewList = commentRepository.findByStudyId(studyId).subList(0, length);
        return viewList;
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Integer id) {
        commentRepository.delete(id);
    }

    public Comment addLike(Comment comment){
        comment.setLikeCount(comment.getLikeCount()+1);
        return commentRepository.save(comment);
    }
}
