package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpeciesImage {
    /**
     * 主键
     */
    private Integer imageId;
    /**
     * 路径
     */
    private String path;
    /**
     * 物种id
     */
    private Integer speciesId;
    private Date createTime;
    private Date updateTime;

}
