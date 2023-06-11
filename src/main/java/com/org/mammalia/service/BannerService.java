package com.org.mammalia.service;

import com.org.mammalia.pojo.Banner;

import java.util.List;

public interface BannerService {
    int addBanner(Banner banner);

    int deleteBannerById(Integer id);

    int updateBannerById(Banner banner);

    Banner inquireBannerById(Integer id);

    List<Banner> inquireAllBanner();
}
