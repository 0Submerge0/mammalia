package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Category;
import com.org.mammalia.pojo.Species;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SpeciesMapper {
    @Insert("""
            insert into t_species
            (species_id,
            c_name,
            latin_name,
            category_id,
            brief_introduction,
            detail_introduction,
            recommend,
            level,
            create_time,
            update_time)
            values (#{species.speciesId},
            #{species.cName},
            #{species.latinName},
            #{species.categoryId},
            #{species.briefIntroduction},
            #{species.detailIntroduction},
            #{species.recommend},
            #{species.level},
            current_timestamp,
            current_timestamp);
            """)
    int addSpecies(@Param("species") Species species);

    @Delete("delete from t_species where species_id = #{speciesId};")
    int deleteSpeciesById(@Param("speciesId") Integer speciesId);

    @Delete("delete from t_species where category_id = #{categoryId};")
    int deleteSpeciesByCategoryId(@Param("categoryId") Integer categoryId);

    @Update("""
            update t_species set
            species_id = #{species.speciesId},
            c_name = #{species.cName},
            latin_name = #{species.latinName},
            category_id = #{species.categoryId},
            brief_introduction = #{species.briefIntroduction},
            detail_introduction = #{species.detailIntroduction},
            recommend = #{species.recommend},
            level = #{species.level},
            update_time = current_timestamp
            where species_id = #{species.speciesId};
            """)
    int updateSpeciesById(@Param("species") Species species);

    @Select("select * from t_species where species_id = #{speciesId}")
    Species inquireSpeciesById(@Param("speciesId") Integer speciesId);

    @Select("""
            select * from t_species s,  t_category c where
            s.category_id = c.category_id and
            c.category_class = #{category.categoryClass} and
            c.category_order = #{category.categoryOrder} and
            c.category_family = #{category.categoryFamily} and
            c.category_genus = #{category.categoryGenus} and
            c.category_species = #{category.categorySpecies}
            """)
    Species inquireSpeciesByCondition(@Param("category") Category category);

    @Select("select * from t_species")
    List<Species> inquireAllSpecies();
}
