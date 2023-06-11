package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.SpeciesClassify;
import com.org.mammalia.mapper.CategoryMapper;
import com.org.mammalia.mapper.SpeciesMapper;
import com.org.mammalia.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private SpeciesMapper speciesMapper;

    @Override
    public int addCategory(Category categories) {
        return categoryMapper.addCategory(categories);
    }

    @Override
    public int deleteCategoryById(Integer id) {
        speciesMapper.deleteSpeciesByCategoryId(id);
        return categoryMapper.deleteCategoryById(id);
    }

    @Override
    public int updateCategoryById(Category category) {
        return categoryMapper.updateCategoryById(category);
    }

    @Override
    public Category inquireCategoryById(Integer id) {
        return categoryMapper.inquireCategoryById(id);
    }

    @Override
    public Category inquireByCategoryByName(String categoryName) {
        return categoryMapper.inquireByCategoryByName(categoryName);
    }

    @Override
    public List<SpeciesClassify> inquireCategoryByParentId(Integer id) {
        return null;
    }

//    @Override
//    public List<SpeciesClassify> inquireCategoryByParentId(Integer id) {
//        return categoryMapper.inquireCategoryById(id);
//    }

    @Override
    public Category inquireByCondition(Category category) {
        return categoryMapper.inquireByCondition(category);
    }

    @Override
    public List<Category> inquireAllCategory() {
        return categoryMapper.inquireAllCategories();
    }
}
