package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photo {

    /**
     * 摄影作品表ID
     */
    private Integer photoId;

    /**
     * 照片来源
     */
    private String photoUrl;

    /**
     * 修改时间
     */
    private Date photoModifiedTime;
    /**
     * 创建时间
     */
    private Date photoCreationTime;

}
