package com.org.mammalia.controller;

import com.org.mammalia.pojo.Banner;
import com.org.mammalia.service.BannerService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BannerController {
    @Resource
    private BannerService bannerService;

    @RequestMapping(value = "/addBanner")
    public Map<String, Object> addBanner(Banner banner) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", bannerService.addBanner(banner) == 1);
        return map;
    }

    @RequestMapping(value = "/deletebannerById")
    public Map<String, Object> deleteBannerById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", bannerService.deleteBannerById(id) == 1);
        return map;
    }

    @RequestMapping("/updateBannerById")
    public Map<String, Object> updateBannerById(Banner banner) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", bannerService.updateBannerById(banner) == 1);
        return map;
    }

    @RequestMapping(value = "/bannerList")
    public Map<String, Object> inquireBannerList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", bannerService.inquireAllBanner());
        return map;
    }

}
