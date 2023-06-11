package com.org.mammalia.service;

import com.org.mammalia.pojo.Works;

import java.util.List;

public interface WorksService {
    int addWorks(Works works);

    int deleteWorksById(Integer id);

    int updateWorksById(Works works);

    Works inquireWorksById(Integer id);

    List<Works> inquireAllWorksByUserId(Integer userId);

    List<Works> inquireAllWorksByPhotoWallId(Integer photoWallId);

    List<Works> inquireAllWorks();
}
