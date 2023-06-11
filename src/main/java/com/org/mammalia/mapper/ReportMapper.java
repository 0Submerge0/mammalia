package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Report;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReportMapper {
    //增加
    @Insert("""
            insert into t_report
            (report_id, 
            user_id,
            user_name, 
            user_phone,
            report_email,
            report_time,
            report_reason)
            values
            (#{report.reportId}, 
            #{report.userId}
            #{report.userName}, 
            #{report.userPhone}, 
            #{report.reportEmail}, 
            #{report.userTime},
            #{report.reportReason})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "reportId")
    int addReport(@Param("report") Report report);
    //删除
    @Delete("delete from t_report where report_id=#{reportId}")
    int deleteReportById(@Param("reportId") Integer reportId);
    //更新，修改
    @Update("""
            update t_report set
            user_name=#{report.userName},
            user_id=#{report.userCardId},
            report_email=#{report.reportEmail},
            user_phone=#{report.userPhone},
            report_reason=#{report.reportReason}
            where report_id=#{report.reportId}
            """)
    int updateReportById(@Param("report") Report report);
    //根据id查询
    @Select("select * from t_report where report_id=#{reportId}")
    Report inquireReportById(@Param("reportId") Integer reportId);

    @Select("select * from t_report")
    List<Report> inquireAllReports();
}
