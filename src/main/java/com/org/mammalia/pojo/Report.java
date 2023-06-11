package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户反馈表
 * t_report
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    /**
     * 举报表id
     */
    private Integer userId;
    /**
     * 举报用户id
     */
    private Integer reportId;

    /**
     * 举报用户姓名
     */
    private String userName;
    /**
     * 手机号
     */
    private Integer userPhone;
    /**
     * Email
     */
    private String reportEmail;
    private Date reportTime;
    /**
     * 举报内容
     */
    private String reportReason;
}
