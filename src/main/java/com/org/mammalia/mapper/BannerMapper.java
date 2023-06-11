package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Banner;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BannerMapper {
    //增加
    @Insert("""
            insert into t_banner
            (banner_id,
            banner_name,
            path,
            species_id,
            works_id,
            banner_create_time,
            banner_update_time)
            values
            (#{banner.bannerId},
            #{banner.bannerName},
            #{banner.path},
            #{banner.speciesId},
            #{banner.worksId},
            current_timestamp,
            current_timestamp
            )
            """)
    @Options(useGeneratedKeys = true, keyProperty = "bannerId")
    int addBanner(@Param("banner") Banner banner);
    //删除
    @Delete("delete from t_banner where banner_id=#{bannerId}")
    int deleteBannerById(@Param("bannerId") Integer bannerId);
    //更新，修改
    @Update("""
            update t_banner set
            banner_name=#{banner.bannerName},
            path=#{banner.path}
            where banner_id=#{banner.bannerId}
            """)
    int updateBannerById(@Param("banner") Banner banner);
    //根据id查询
    @Select("select * from t_banner where banner_id=#{bannerId}")
    Banner inquireBannerById(@Param("bannerId") Integer bannerId);
    //查询全部
    @Select("select * from t_banner")
    List<Banner> inquireAllBanner();
}
