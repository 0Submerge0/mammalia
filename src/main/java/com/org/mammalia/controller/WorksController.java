package com.org.mammalia.controller;

import com.org.mammalia.pojo.Works;
import com.org.mammalia.service.WorksService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WorksController {
    @Resource
    private WorksService worksService;

    @RequestMapping(value = "/worksList")
    public Map<String, Object> inquireWorksList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", worksService.inquireAllWorks());
        return map;

    }

    @RequestMapping(value = "/addWorks")
    public Map<String, Object> addWorks(Works works) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", worksService.addWorks(works) == 1);
        return map;
    }

    @RequestMapping(value = "/deleteworksById")
    public Map<String, Object> deleteworksById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", worksService.deleteWorksById(id)== 1 );
        return map;
    }
    @RequestMapping("/updatWorksById")
    public Map<String, Object> updatWorksById(Works works) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", worksService.updateWorksById(works) == 1 );
        return map;
    }
}
