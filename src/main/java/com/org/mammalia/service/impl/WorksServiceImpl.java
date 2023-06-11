package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.Works;
import com.org.mammalia.mapper.WorksMapper;
import com.org.mammalia.service.WorksService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {
    @Resource
    private WorksMapper worksMapper;

    @Override
    public int addWorks(Works works) {
        return worksMapper.addWorks(works);
    }

    @Override
    public int deleteWorksById(Integer id) {
        return worksMapper.deleteWorksById(id);
    }

    @Override
    public int updateWorksById(Works works) {
        return worksMapper.updateWorksById(works);
    }

    @Override
    public Works inquireWorksById(Integer id) {
        return worksMapper.inquireWorksById(id);
    }

    @Override
    public List<Works> inquireAllWorksByUserId(Integer userId) {
        return worksMapper.inquireAllWorksByUserId(userId);
    }

    @Override
    public List<Works> inquireAllWorksByPhotoWallId(Integer photoWallId) {
        return null;
    }

    @Override
    public List<Works> inquireAllWorks() {
        return worksMapper.inquireAllWorks();
    }
}
