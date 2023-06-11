package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.SpeciesImage;
import com.org.mammalia.mapper.SpeciesImageMapper;
import com.org.mammalia.service.SpeciesImageService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesImageServiceImpl implements SpeciesImageService {
    @Resource
    SpeciesImageMapper speciesImageMapper;

    @Override
    public int addSpeciesImage(SpeciesImage speciesImage) {
        return speciesImageMapper.addSpeciesImage(speciesImage);
    }

    @Override
    public int deleteSpeciesImageById(Integer id) {
        return speciesImageMapper.deleteSpeciesImageById(id);
    }

    @Override
    public int updateSpeciesImageById(SpeciesImage speciesImage) {
        return speciesImageMapper.updateSpeciesImageById(speciesImage);
    }

    @Override
    public SpeciesImage inquireSpeciesImageById(Integer id) {
        return speciesImageMapper.inquireSpeciesImageById(id);
    }

    @Override
    public List<String> inquireSpeciesImagePathByName(String name) {
        return speciesImageMapper.inquireSpeciesImageByName(name);
    }

    @Override
    public List<SpeciesImage> inquireAllSpeciesImages() {
        return speciesImageMapper.inquireAllSpeciesImages();
    }
}
