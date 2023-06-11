package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 物种分类表
 * t_category
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    /**
     * 主键
     */

    private Integer categoryId;
    /**
     * 名
     */
    private String categoryName;
    /**
     * 中文名
     */
    private String categoryCnName;
    /**
     * 拉丁名
     */
    private String categoryLatinName;
    /**
     * 纲总数
     */
    private  String categoryClass;
    /**
     * 目总数
     */
    private String categoryOrder;
    /**
     * 科总数
     */
    private String categoryFamily;
    /**
     * 属总数
     */
    private String categoryGenus;
    /**
     * 种总数
     */
    private String categorySpecies;
    /**
     * 等级
     */
    private String categoryGrade;

}
