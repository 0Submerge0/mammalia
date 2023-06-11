package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Works;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WorksMapper {

    @Delete("delete from t_works where works_id = #{worksId};")
    int deleteWorksById(@Param("worksId") Integer worksId);

    @Insert("""
            insert into t_works
            (works_id,
            user_id,
            user_name,
            species_id,
            image_url,
            works_author,
            works_description,
            is_public,
            works_commentcount,
            works_viewcount,
            works_likecount,
            works_time,
            works_update_time)
            values(#{works.worksId},
            #{works.userId},
            #{works.worksuserName},
            #{works.speciesId},
            #{works.imageId},
            #{works.auther},
            #{works.worksDescription},
            #{works.isPublic},
            #{works.worksCommentcount},
            #{works.worksViewcount},
            #{works.worksLikecount},
            #{works.worksTime},
            #{works.worksUpdateTime})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "worksId")
    int addWorks(@Param("works") Works works);
    //根据id删除
    @Delete("delete from t_works where works_id = #{worksId}")
    int deleteWorksByUserId(@Param("worksId") Integer worksId);
    //更新
    @Update("""
            update t_works set
            works_id=#{works.worksId},
            works_description=#{works.worksDescription},
            works_author=#{works.worksAuthor},
            works_time=#{works.worksTime},
            works_update_time=#{works.worksUpdatetime}
            where works_id=#{works.worksId}
            """)
    int updateWorksById(@Param("works") Works works);
    //根据摄影作品id查询
    @Select("select * from t_works where works_id=#{worksId}")
    Works inquireWorksById(@Param("id") Integer id);
    //根据作者id查询
    @Select("select * from t_works where user_id = #{userId}")
    List<Works> inquireAllWorksByUserId(@Param("userId") Integer userId);

    @Results({
            @Result(id = true, column = "works_id", property = "worksId"),
            @Result(id = true, column = "works_description", property = "worksDescription"),
            @Result(id = true, column = "works_author", property = "worksAuthor",
                    one = @One(select = "com.org.mammalia.mapper.UserMapper.inquireUserById")),
            @Result(id = true, column = "works_update_time", property = "worksUpdateTime"),
            @Result(id = true, column = "works_url", property = "worksUrl"),
    })
    @Select("select * from t_works")
    List<Works> inquireAllWorks();
}
