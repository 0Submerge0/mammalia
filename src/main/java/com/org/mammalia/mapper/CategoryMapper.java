package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.SpeciesClassify;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Insert("""
            insert into t_category
            (category_id,
            category_name,
            category_cn_name,
            category_latin_name,
            category_class,
            category_order,
            category_family,
            category_genus,
            category_species,
            category_grade)
            values
            (#{category.categoryId},
            #{category.categoryName},
            #{category.categoryCnName},
            #{category.categoryLatinName},
            #{category.categoryClass},
            #{category.categoryOrder},
            #{category.categoryFamily},
            #{category.categoryGenus},
            #{category.categorySpecies},
            #{category.categorygrade})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "categoryId")
    int addCategory(@Param("category") Category category);

    @Delete("delete from t_category where category_id=#{categoryId}")
    int deleteCategoryById(@Param("categoryId") Integer categoryId);

    @Update("""
            update t_category set
            category_name=#{category.categoryName},
            category_Class=#{category.categoryClass},
            category_order=#{category.categoryOrder},
            category_family=#{category.categoryFamily},
            category_genus=#{category.categoryGenus},
            category_species=#{category.categorySpecies},
            category_grade=#{category.categoryGrade}
            where category_id=#{category.categoryId}
            """)
    int updateCategoryById(@Param("category") Category category);

    @Select("select * from t_category where category_id=#{categoryId}")
    Category inquireCategoryById(@Param("categoryId") Integer categoryId);

    @Select("""
            select * from t_category where
            category_class = #{category.categoryClass} and
            category_order = #{category.categoryOrder} and
            category_family = #{category.categoryFamily} and
            category_genus = #{category.categoryGenus} and
            category_species = #{category.categoryMammalia}
            """)
    Category inquireByCondition(@Param("category") Category category);

    @Select("select * from t_category")
    Category inquireByCategoryByName(String categoryName);

//    @Select("select * from species_classify where parent_id = #{id} ;")
//    List<SpeciesClassify> inquireCategoryByParentId(@Param("id") Integer id);
    //查询全部
    @Select("select * from t_category")
    List<Category> inquireAllCategories();

}
