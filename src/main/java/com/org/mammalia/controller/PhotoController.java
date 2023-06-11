package com.org.mammalia.controller;

import com.org.mammalia.pojo.Photo;
import com.org.mammalia.service.PhotoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PhotoController {
    @Resource
    private PhotoService photoService;

    @RequestMapping(value = "/photoList")
    public Map<String, Object> inquireWorksList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", photoService.inquireAllPhotos());
        return map;
    }

    @RequestMapping(value = "/addPhoto")
    public Map<String, Object> addPhoto(Photo photo) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", photoService.addPhoto(photo) == 1);
        return map;
    }

    @RequestMapping("/updatePhotoById")
    public Map<String, Object> updatePhotoById(Photo photo) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", photoService.updatePhotoById(photo) == 1);
        return map;
    }
    @RequestMapping(value = "/deletePhotoById")
    public Map<String, Object> deletePhotoById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", photoService.deletePhotoById(id) == 1);
        return map;
    }

}
