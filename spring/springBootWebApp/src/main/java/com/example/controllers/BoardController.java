package com.example.controllers;

import com.example.domain.Board;
import com.example.services.BoardService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HSH on 2016. 1. 15..
 */
@Controller
public class BoardController {

    Logger log = Logger.getLogger(BoardController.class);

    private BoardService boardService;

    @Autowired
    public void setBoardService(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("boards/new")
    public String newBoard(Model model) {
        model.addAttribute("board", new Board());
        return "boardform";
    }

    @RequestMapping(value = "/boards", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("boards", boardService.listAllBoards());
        return "boards";
    }

    @RequestMapping("board/{id}")
    public String showBoard(@PathVariable Integer id, Model model){
        model.addAttribute("board", boardService.getBoardById(id));
        return "boardshow";
    }

    @RequestMapping("board/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("board", boardService.getBoardById(id));
        return "boardform";
    }

    @RequestMapping(value = "board", method = RequestMethod.POST)
    public String saveBoard(Board board){
        boardService.saveBoard(board);
        return "redirect:/board/" + board.getId();
    }

    @RequestMapping("board/delete/{id}")
    public String delete(@PathVariable Integer id){
        boardService.deleteBoard(id);
        return "redirect:/boards";
    }

    @RequestMapping("boards/eval/{id}")
    public String addLike(@PathVariable Integer id, Model model){
        model.addAttribute("boards", boardService.addLike(boardService.getBoardById(id)));
        return "redirect:/boards/";
    }


}