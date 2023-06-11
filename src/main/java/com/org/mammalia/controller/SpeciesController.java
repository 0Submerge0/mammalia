package com.org.mammalia.controller;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.Species;
import com.org.mammalia.service.CategoryService;
import com.org.mammalia.service.SpeciesService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SpeciesController {
    @Resource
    private SpeciesService speciesService;
    @Resource
    private CategoryService categoryService;

    @RequestMapping(value = "/searchByCondition", method = RequestMethod.POST)
    public Map<String, Object> conditionalQuery(Category category) {
        Species species = speciesService.inquireByCondition(category);
        category = categoryService.inquireByCondition(category);
        Map<String, Object> map = new HashMap<>();
        map.put("species", species);
        map.put("category", category);
        return map;
    }

    @RequestMapping(value = "/speciesList")
    public Map<String, Object> inquireSpeciesList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", speciesService.inquireAllSpecies());
        return map;
    }

    @RequestMapping(value = "/addSpecies")
    public Map<String, Object> addSpecies(Species species) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", speciesService.addSpecies(species) == 1);
        return map;
    }

    @RequestMapping(value = "/deleteSpeciesById")
    public Map<String, Object> deleteSpeciesById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", speciesService.deleteSpeciesById(id) == 1 );
        return map;
    }
    @RequestMapping("/updateSpeciesById")
    public Map<String, Object> updateSpeciesById(Species species) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", speciesService.updateSpeciesById(species) == 1);
        return map;
    }
}
