package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.Report;
import com.org.mammalia.mapper.ReportMapper;
import com.org.mammalia.service.ReportService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportMapper reportMapper;

    @Override
    public int addReport(Report report) {
        return reportMapper.addReport(report);
    }

    @Override
    public int deleteReportById(Integer id) {
        return reportMapper.deleteReportById(id);
    }

    @Override
    public int updateReportById(Report report) {
        return reportMapper.updateReportById(report);
    }

    @Override
    public Report inquireReportById(Integer id) {
        return reportMapper.inquireReportById(id);
    }

    @Override
    public List<Report> inquireAllReport() {
        return reportMapper.inquireAllReports();
    }
}
