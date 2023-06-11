package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Photo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PhotoMapper {
    //增加
    @Insert("""
            insert into t_photo
            (photo_id,
            path_url,
            photo_creation_time,
            photo_modified_time
            )
            values(
            #{photo.photoId},
            #{photo.pathUrl},
            current_timestamp,
            current_timestamp
            )
            """)
    @Options(useGeneratedKeys = true, keyProperty = "photoId")
    int addPhoto(@Param("photo") Photo photo);
    //删除
    @Delete("delete from t_photo where photo_id=#{photoId}")
    int deletePhotoById(@Param("photoId") Integer photoId);
    //更新，修改
    @Update("""
            update t_photo set
            path_url=#{photo.photoUrl},
            photo_modified_time=current_timestamp
            where photo_id=#{photo.photoId}
            """)
    int updatePhotoById(@Param("photo") Photo photo);
    //根据id查询
    @Select("select * from t_photo where photo_id=#{photoId}")
    Photo inquirePhotoById(@Param("photoId") Integer photoId);
    //根据电话查询
    @Select("select * from t_photo")
    List<Photo> inquireAllPhotos();

}
