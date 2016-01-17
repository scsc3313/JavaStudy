package com.example.controllers;

import com.example.domain.Comment;
import com.example.services.CommentService;
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
public class CommentController {

    Logger log = Logger.getLogger(CommentController.class);

    private CommentService commentService;

    @Autowired
    public void setcommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping("comments/new")
    public String newComment(Model model) {
        model.addAttribute("comment", new Comment());
        return "commentform";
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("comments", commentService.listAllcomments());
        return "comments";
    }

    @RequestMapping("comment/{id}")
    public String showComment(@PathVariable Integer id, Model model){
        model.addAttribute("comment", commentService.getCommentById(id));
        return "commentshow";
    }

    @RequestMapping("comment/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("comment", commentService.getCommentById(id));
        return "commentform";
    }

    @RequestMapping(value = "comment", method = RequestMethod.POST)
    public String saveComment(Comment comment){
        commentService.saveComment(comment);
        return "redirect:/comment/" + comment.getId();
    }

    @RequestMapping("comment/delete/{id}")
    public String delete(@PathVariable Integer id){
        commentService.deleteComment(id);
        return "redirect:/comments";
    }

    @RequestMapping("comments/eval/{id}")
    public String addLike(@PathVariable Integer id, Model model){
        model.addAttribute("comments", commentService.addLike(commentService.getCommentById(id)));
        return "redirect:/comments/";
    }


}