package com.service;

import com.mapper.TopCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopCategoryService {

    @Autowired
    private TopCategoryMapper mapper;

    public TopCategoryMapper getMapper(){
        return mapper;
    }
}
