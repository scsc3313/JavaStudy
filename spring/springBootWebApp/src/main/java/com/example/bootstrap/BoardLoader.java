//package com.example.bootstrap;
//
//import com.example.domain.Board;
//import com.example.repositories.BoardRepository;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
///**
// * Created by HSH on 2016. 1. 14..
// */
//@Component
//public class BoardLoader implements ApplicationListener<ContextRefreshedEvent> {
//
//    private BoardRepository boardRepository;
//
//    private Logger log = Logger.getLogger(BoardLoader.class);
//
//    @Autowired
//    public void setBoardRepository(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        Board shirt = new Board();
//        shirt.setDescription("응팔존잼!ㅠㅠㅠ");
//        shirt.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
//        shirt.setBoardId("1");
//        boardRepository.save(shirt);
//
//        log.info("Saved id: " + shirt.getId());
//
//        Board mug = new Board();
//        mug.setDescription("응팔 진심 존잼 ㅎㅎ");
//        mug.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_coffee_mug-r11e7694903c348e1a667dfd2f1474d95_x7j54_8byvr_512.jpg");
//        mug.setBoardId("2");
//        boardRepository.save(mug);
//
//        log.info("Saved id:" + mug.getId());
//    }
//}
