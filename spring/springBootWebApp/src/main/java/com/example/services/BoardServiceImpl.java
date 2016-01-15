package com.example.services;

import com.example.domain.Board;
import com.example.repositories.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HSH on 2016. 1. 15..
 */
@Service
public class BoardServiceImpl implements BoardService {

    private BoardRepository boardRepository;

    @Autowired
    public void setBoardRepository(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Iterable<Board> listAllBoards() {
        return boardRepository.findAll();
    }

    @Override
    public Board getBoardById(Integer id) {
        return boardRepository.findOne(id);
    }

    @Override
    public Board saveBoard(Board board) {
        return boardRepository.save(board);
    }

    @Override
    public void deleteBoard(Integer id) {
        boardRepository.delete(id);
    }
}
