package com.org.mammalia.controller;

import com.org.mammalia.pojo.Report;
import com.org.mammalia.service.ReportService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ReportController {
    @Resource
    private ReportService reportService;

    @RequestMapping(value = "/addReport")
    public Map<String, Object> addReport(Report report) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", reportService.addReport(report) == 1);
        return map;
    }
    @RequestMapping(value = "/reportList")
    public Map<String, Object> inquireReportList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", reportService.inquireAllReport());
        return map;
    }
    @RequestMapping(value = "/deletereportById")
    public Map<String, Object> deletereportById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", reportService.deleteReportById(id)== 1);
        return map;
    }
    @RequestMapping("/updateReportById")
    public Map<String, Object> updateReportById(Report report) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", reportService.updateReportById(report) == 1);
        return map;
    }
}

