package com.example.comment.services;

import com.example.comment.domain.Comment;

import java.util.List;

/**
 * Created by HSH on 2016. 1. 15..
 */
public interface CommentService {
    Iterable<Comment> listAllcomments();

    Comment getCommentById(Integer id);

    List<Comment> findByStudyId(Integer studyId);

    Comment saveComment(Comment comment);

    void deleteComment(Integer id);

    Comment addLike(Comment comment);
}
