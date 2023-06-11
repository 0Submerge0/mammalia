package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.Banner;
import com.org.mammalia.mapper.BannerMapper;
import com.org.mammalia.service.BannerService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerMapper bannerMapper;

    @Override
    public int addBanner(Banner banner) {
        return bannerMapper.addBanner(banner);
    }

    @Override
    public int deleteBannerById(Integer id) {
        return bannerMapper.deleteBannerById(id);
    }

    @Override
    public int updateBannerById(Banner banner) {
        return bannerMapper.updateBannerById(banner);
    }

    @Override
    public Banner inquireBannerById(Integer id) {
        return bannerMapper.inquireBannerById(id);
    }

    @Override
    public List<Banner> inquireAllBanner() {
        return bannerMapper.inquireAllBanner();
    }
}
