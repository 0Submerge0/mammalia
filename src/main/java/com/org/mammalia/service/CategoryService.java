package com.org.mammalia.service;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.SpeciesClassify;

import java.util.List;

public interface CategoryService {
    int addCategory(Category categories);

    int deleteCategoryById(Integer id);

    int updateCategoryById(Category category);

    Category inquireCategoryById(Integer id);

    Category inquireByCategoryByName(String categoryName);

    List<SpeciesClassify> inquireCategoryByParentId(Integer id);

    Category inquireByCondition(Category category);

    List<Category> inquireAllCategory();
}
