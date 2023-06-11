package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
* 摄影作品表
* t_works
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Works {

    /**
    * 每幅作品的唯一标识 ID
    */
    private Integer worksId;
    /**
    * 作品描述
    */
    private Integer userId;
    private String userName;
    private Integer speciesId;
    private String worksDescription;
    /**
    * 作品作者
    */
    private User worksAuthor;
    /**
     * 路径
     */
    private String imageUrl;
    private String isPublic;
    private Integer worksCommentcount;
    private Integer worksViewcount;
    private Integer worksLikecount;
    /**
    * 拍摄时间
    */
    private Date worksTime;

    /**
    * 作品最近一次更新的时间
    */
    private Date worksUpdateTime;

}
