package com.org.mammalia.controller;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @RequestMapping(value = "/addCategory")
    public Map<String, Object> addCategory(Category category) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", categoryService.addCategory(category) == 1);
        return map;
    }

    @RequestMapping(value = "/categoryList")
    public Map<String, Object> inquireCategoryList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", categoryService.inquireAllCategory());
        return map;
    }

    @RequestMapping(value = "/inquireCategoryByParentId")
    public Map<String, Object> inquireCategoryByParentId(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", categoryService.inquireCategoryByParentId(id));
        return map;
    }

    @RequestMapping(value = "/deleteCategoryById")
    public Map<String, Object> deleteCategoryById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", categoryService.deleteCategoryById(id) == 1);
        return map;
    }

    @RequestMapping("/updateCategoryById")
    public Map<String, Object> updateCategoryById(Category category) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", categoryService.updateCategoryById(category) == 1);
        return map;
    }

}
