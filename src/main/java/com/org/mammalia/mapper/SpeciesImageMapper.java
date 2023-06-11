package com.org.mammalia.mapper;

import com.org.mammalia.pojo.SpeciesImage;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SpeciesImageMapper {
    //增加，添加
    @Insert("""
            insert into species_image
            (image_id, 
            path,
            species_id,
            create_time,
            update_time)
            values
            (#{speciesId}, 
            #{path}, 
            #{imageId}
            #{createTime},
            #{updateTime})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addSpeciesImage(@Param("speciesImage") SpeciesImage speciesImage);
    //删除
    @Delete("delete from species_image where species_id=#{speciesId}")
    int deleteSpeciesImageById(@Param("id") Integer id);
    //更新，修改
    @Update("""
            update species_image set
            species_id=#{speciesId},
            path=#{path},
            image_id=#{imageId}
            where species_id=#{speciesImage.id}
            """)
    int updateSpeciesImageById(@Param("speciesImage") SpeciesImage speciesImage);
    //根据id查询
    @Select("select * from species_image where image_id=#{id}")
    SpeciesImage inquireSpeciesImageById(@Param("id") Integer id);
    //根据姓名查询路径
    @Select("""
            select path from species_image
            join t_species ts on species_image.species_id = ts.species_id
            where ts.latin_name = #{name} or ts.c_name = #{name}
            """)
    List<String> inquireSpeciesImageByName(@Param("name") String name);
    //查询全部
    @Select("select * from species_image")
    List<SpeciesImage> inquireAllSpeciesImages();
}
