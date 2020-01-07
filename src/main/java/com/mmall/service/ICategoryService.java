package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * @author pxChen
 * @date 2020/1/7
 */
public interface ICategoryService {

    ServerResponse<String> addCategory(String categoryName,Integer parentId);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<String> setCategoryName(String categoryName,Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
