package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.UnderlyingCategory;
import com.service.UnderlyingCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UnderlyingCategoryController {

    @Autowired
    UnderlyingCategoryService service;

    @ResponseBody
    @RequestMapping(value = "/underlyingcategory",method = RequestMethod.GET,produces ="application/json;charset=utf-8" )
    public String underlyingcategory(){
        List<UnderlyingCategory> list = service.getMapper().findByCate1_id(2);
        return JSON.toJSONString(list);
    }
}
