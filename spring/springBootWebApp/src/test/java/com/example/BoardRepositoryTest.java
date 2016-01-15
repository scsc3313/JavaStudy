//package com.example;
//
//import com.example.domain.Board;
//import com.example.repositories.BoardRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.data.repository.config.RepositoryConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import static org.junit.Assert.*;
//
///**
// * Created by HSH on 2016. 1. 14..
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
//public class BoardRepositoryTest {
//
//    private BoardRepository boardRepository;
//
//    @Autowired
//    public void setBoardRepository(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
//
//    @Test
//    public void testSaveProduct(){
//        //setup product
//        Board product = new Board();
//        product.setDescription("Spring Framework Guru Shirt");
//        product.setBoardId("1234");
//
//        //save product, verify has ID value after save
//        assertNull(product.getId()); //null before save
//        boardRepository.save(product);
//        assertNotNull(product.getId()); //not null after save
//
//        //fetch from DB
//        Board fetchedProduct = boardRepository.findOne(product.getId());
//
//        //should not be null
//        assertNotNull(fetchedProduct);
//
//        //should equal
//        assertEquals(product.getId(), fetchedProduct.getId());
//        assertEquals(product.getDescription(), fetchedProduct.getDescription());
//
//        //update description and save
//        fetchedProduct.setDescription("New Description");
//        boardRepository.save(fetchedProduct);
//
//        //get from DB, should be updated
//        Board fetchedUpdatedProduct = boardRepository.findOne(fetchedProduct.getId());
//        assertEquals(fetchedProduct.getDescription(), fetchedUpdatedProduct.getDescription());
//
//        //verify count of products in DB
//        long productCount = boardRepository.count();
//        assertEquals(productCount, 1);
//
//        //get all products, list should only have one
//        Iterable<Board> products = boardRepository.findAll();
//
//        int count = 0;
//
//        for(Board p : products){
//            count++;
//        }
//
//        assertEquals(count, 1);
//    }
//}