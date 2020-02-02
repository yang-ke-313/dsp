package com.service;

import com.mapper.UnderlyingCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnderlyingCategoryService {
    @Autowired
    private UnderlyingCategoryMapper mapper;

    public UnderlyingCategoryMapper getMapper(){
        return mapper;
    }
}
