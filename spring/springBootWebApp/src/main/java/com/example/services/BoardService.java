package com.example.services;

import com.example.domain.Board;

/**
 * Created by HSH on 2016. 1. 15..
 */
public interface BoardService {
    Iterable<Board> listAllBoards();

    Board getBoardById(Integer id);

    Board saveBoard(Board board);

    void deleteBoard(Integer id);

    Board addLike(Board board);
}
