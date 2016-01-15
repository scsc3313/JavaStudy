package com.example.repositories;

import com.example.domain.Board;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HSH on 2016. 1. 13..
 */
public interface BoardRepository extends CrudRepository<Board, Integer> {
}
