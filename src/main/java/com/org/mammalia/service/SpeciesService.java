package com.org.mammalia.service;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.Species;

import java.util.List;

public interface SpeciesService {
    int addSpecies(Species species);

    int deleteSpeciesById(Integer id);

    int updateSpeciesById(Species species);

    Species inquireSpeciesById(Integer id);

    Species inquireByCondition(Category category);

    List<Species> inquireAllSpecies();
}
