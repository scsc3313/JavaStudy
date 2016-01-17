//package com.example;
//
//import com.example.domain.comment;
//import com.example.repositories.commentRepository;
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
//public class commentRepositoryTest {
//
//    private commentRepository commentRepository;
//
//    @Autowired
//    public void setcommentRepository(commentRepository commentRepository) {
//        this.commentRepository = commentRepository;
//    }
//
//    @Test
//    public void testSaveProduct(){
//        //setup product
//        comment product = new comment();
//        product.setDescription("Spring Framework Guru Shirt");
//        product.setcommentId("1234");
//
//        //save product, verify has ID value after save
//        assertNull(product.getId()); //null before save
//        commentRepository.save(product);
//        assertNotNull(product.getId()); //not null after save
//
//        //fetch from DB
//        comment fetchedProduct = commentRepository.findOne(product.getId());
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
//        commentRepository.save(fetchedProduct);
//
//        //get from DB, should be updated
//        comment fetchedUpdatedProduct = commentRepository.findOne(fetchedProduct.getId());
//        assertEquals(fetchedProduct.getDescription(), fetchedUpdatedProduct.getDescription());
//
//        //verify count of products in DB
//        long productCount = commentRepository.count();
//        assertEquals(productCount, 1);
//
//        //get all products, list should only have one
//        Iterable<comment> products = commentRepository.findAll();
//
//        int count = 0;
//
//        for(comment p : products){
//            count++;
//        }
//
//        assertEquals(count, 1);
//    }
//}