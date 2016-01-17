package com.example.services;

import com.example.domain.Comment;

/**
 * Created by HSH on 2016. 1. 15..
 */
public interface CommentService {
    Iterable<Comment> listAllcomments();

    Comment getCommentById(Integer id);

    Comment saveComment(Comment comment);

    void deleteComment(Integer id);

    Comment addLike(Comment comment);
}
