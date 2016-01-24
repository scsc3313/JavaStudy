package com.example.comment.services;

import com.example.comment.domain.Study;

/**
 * Created by HSH on 2016. 1. 24..
 */
public interface StudyService {
    Iterable<Study> listAllstudys();

    Study getStudyById(Integer studyId);

    Study saveStudy(Study study);

    void deleteStudy(Integer studyId);
}
