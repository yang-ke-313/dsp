package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.TopCategory;
import com.entity.UnderlyingCategory;
import com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 杨可
 */
@Controller
public class CategoryController {

    @Autowired
    CategoryService serviceUnderly;


    @ResponseBody
    @RequestMapping(value = "/underlycategory",method = RequestMethod.GET,produces ="application/json;charset=utf-8" )
    public String underlycategory(){
        List<UnderlyingCategory> list = serviceUnderly.getMapper().findByCate1Id(2);
        return JSON.toJSONString(list);
    }

    @Autowired
    CategoryService serviceTop;


    @ResponseBody
    @RequestMapping(value = "/topcategory",method = RequestMethod.GET,produces ="application/json;charset=utf-8" )
    public String topcategory(){
        List<TopCategory> list = serviceTop.getMapper().getAllTopCategory();
        return JSON.toJSONString(list);
    }
}
