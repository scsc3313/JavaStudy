package com.example.repositories;

import com.example.domain.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HSH on 2016. 1. 13..
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
