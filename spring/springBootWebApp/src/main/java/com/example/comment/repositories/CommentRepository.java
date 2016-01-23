package com.example.comment.repositories;

import com.example.comment.domain.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HSH on 2016. 1. 13..
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
