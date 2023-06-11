package com.org.mammalia.controller;

import com.org.mammalia.pojo.SpeciesImage;
import com.org.mammalia.service.SpeciesImageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SpeciesImageController {
    @Resource
    private SpeciesImageService speciesImageService;

    @RequestMapping(value = "/getSpeciesImage")
    public List<String> getSpeciesImage(@RequestParam("search_name") String searchName) {
        return speciesImageService.inquireSpeciesImagePathByName(searchName);
    }

    @RequestMapping(value = "/addSpeciesImage")
    public Map<String, Object> addSpeciesImage(SpeciesImage speciesImage) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", speciesImageService.addSpeciesImage(speciesImage) == 1);
        return map;
    }
    @RequestMapping(value = "/deleteSpeciesimageById")
    public Map<String, Object> deleteSpeciesimageById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", speciesImageService.deleteSpeciesImageById(id) == 1);
        return map;
    }
    @RequestMapping("/updateSpeciesimageById")
    public Map<String, Object> updateSpeciesimageById(SpeciesImage speciesImage) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", speciesImageService.updateSpeciesImageById(speciesImage) == 1);
        return map;
    }
}
