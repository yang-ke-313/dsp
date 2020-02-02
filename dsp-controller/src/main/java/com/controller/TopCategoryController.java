package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.TopCategory;
import com.service.TopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TopCategoryController {

    @Autowired
    TopCategoryService service;

    @ResponseBody
    @RequestMapping(value = "/topcategory",method = RequestMethod.GET,produces ="application/json;charset=utf-8" )
    public String topcategory(){
        List<TopCategory> list = service.getMapper().getAll();
        return JSON.toJSONString(list);
    }
}
