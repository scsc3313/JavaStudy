//package com.example.comment.bootstrap;
//
//import com.example.comment.domain.comment;
//import com.example.comment.repositories.StudyRepository;
//import com.example.comment.repositories.commentRepository;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
///**
// * Created by HSH on 2016. 1. 14..
// 웹이 로딩될 때 실행되는 부분!
// */
//@Component
//public class CommentLoader implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    private StudyRepository commentRepository;
//
//    private Logger log = Logger.getLogger(CommentLoader.class);
//
//
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        comment shirt = new comment();
//        shirt.setDescription("응팔존잼!ㅠㅠㅠ");
//        shirt.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
//        shirt.setcommentId("1");
//        commentRepository.save(shirt);
//
//        log.info("Saved id: " + shirt.getId());
//
//        comment mug = new comment();
//        mug.setDescription("응팔 진심 존잼 ㅎㅎ");
//        mug.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_coffee_mug-r11e7694903c348e1a667dfd2f1474d95_x7j54_8byvr_512.jpg");
//        mug.setcommentId("2");
//        commentRepository.save(mug);
//
//        log.info("Saved id:" + mug.getId());
//    }
//}
