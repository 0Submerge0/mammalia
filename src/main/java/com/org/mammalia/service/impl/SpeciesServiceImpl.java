package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.Species;
import com.org.mammalia.mapper.SpeciesMapper;
import com.org.mammalia.service.CategoryService;
import com.org.mammalia.service.SpeciesService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesServiceImpl implements SpeciesService {
    @Resource
    private SpeciesMapper speciesMapper;
    @Resource
    private CategoryService categoryService;

    @Override
    public int addSpecies(Species species) {
        Category category = categoryService.inquireCategoryById(species.getCategoryId());
        if (category == null)
            return 0;
        else
            return speciesMapper.addSpecies(species);
    }

    @Override
    public int deleteSpeciesById(Integer id) {
        Species species = speciesMapper.inquireSpeciesById(id);
        categoryService.deleteCategoryById(species.getCategoryId());
        return speciesMapper.deleteSpeciesById(id);
    }

    @Override
    public int updateSpeciesById(Species species) {
        return speciesMapper.updateSpeciesById(species);
    }

    @Override
    public Species inquireSpeciesById(Integer id) {
        return speciesMapper.inquireSpeciesById(id);
    }

    @Override
    public Species inquireByCondition(Category category) {
        return speciesMapper.inquireSpeciesByCondition(category);
    }

    @Override
    public List<Species> inquireAllSpecies() {
        return speciesMapper.inquireAllSpecies();
    }
}
