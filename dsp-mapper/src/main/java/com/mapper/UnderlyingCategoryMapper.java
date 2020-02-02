package com.mapper;

import com.entity.UnderlyingCategory;

import java.util.List;

public interface UnderlyingCategoryMapper{

    List<UnderlyingCategory> findByCate1_id(Integer cate1_id);

    List<UnderlyingCategory> getAll();
}
