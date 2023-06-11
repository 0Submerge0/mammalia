package com.org.mammalia.service;

import com.org.mammalia.pojo.SpeciesImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpeciesImageService {
    int addSpeciesImage(@Param("speciesImage") SpeciesImage speciesImage);

    int deleteSpeciesImageById(@Param("id") Integer id);

    int updateSpeciesImageById(@Param("speciesImage") SpeciesImage speciesImage);

    SpeciesImage inquireSpeciesImageById(@Param("id") Integer id);

    List<String> inquireSpeciesImagePathByName(String name);

    List<SpeciesImage> inquireAllSpeciesImages();

}
