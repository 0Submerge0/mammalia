package com.org.mammalia.service;

import com.org.mammalia.pojo.Report;

import java.util.List;

public interface ReportService {

    int addReport(Report report);

    int deleteReportById(Integer id);

    int updateReportById(Report report);

    Report inquireReportById(Integer id);

    List<Report> inquireAllReport();

}
