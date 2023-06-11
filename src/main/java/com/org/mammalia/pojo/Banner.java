package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 轮播图表
 * t_banner
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banner {
    /**
     * 主键
     */
    private int bannerId;
    private String bannerName;
    /**
     * 路径
     */
    private String path;
    private Integer worksId;

    private String speciesId;
    /**
     * 创建时间
     */
    private Date bannerCreateTime;
    /**
     * 创建时间
     */
    private Date bannerUpdateTime;
}
