package com.example.comment.services;

import com.example.comment.domain.Study;
import com.example.comment.repositories.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HSH on 2016. 1. 24..
 */
@Service
public class StudyServiceImpl implements StudyService{

    @Autowired
    private StudyRepository studyRepository;

    @Override
    public Iterable<Study> listAllstudys() {
        return studyRepository.findAll();
    }

    @Override
    public Study getStudyById(Integer id) {
        return studyRepository.findOne(id);
    }

    @Override
    public Study saveStudy(Study study) {
        return studyRepository.save(study);
    }

    @Override
    public void deleteStudy(Integer id) {
        studyRepository.delete(id);
    }
}
