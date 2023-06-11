package com.org.mammalia.service;

import com.org.mammalia.pojo.Photo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhotoService {
    int addPhoto(@Param("photo") Photo photo);

    int deletePhotoById(@Param("id") Integer id);

    int updatePhotoById(@Param("photo") Photo photo);

    Photo inquirePhotoById(@Param("id") Integer id);

    List<Photo> inquireAllPhotos();

}
