package com.org.mammalia.mapper;

import com.org.mammalia.pojo.Admin;
import com.org.mammalia.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //插入，新增;user
    @Insert("""
            insert into t_user
            (user_id,
            user_name,
            user_password,
            user_address,
            user_phone,
            user_gender,
            user_email)
            values
            ( #{user.userId},
            #{user.userName},
            #{user.userPassword},
            #{user.userAddress},
            #{user.userPhone},
            #{user.userEmail})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    int addUser(@Param("user") User user);
    //插入，新增;admin
    @Insert("""
            insert into t_admin
            (admin_id,
            admin_username,
            admin_password)
            values
            (
            #{admin.adminId},
            #{admin.adminUsername},
            #{admin.adminPassword}
            )
            """)
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    int addAdmin(@Param("admin") Admin admin);
    //删除；user
    @Delete("delete from t_user where user_id=#{id}")
    int deleteUserById(@Param("id") Integer id);
    //删除；admin
    @Delete("delete from t_admin where admin_id=#{id}")
    int deleteAdminById(@Param("id") Integer id);
    //更新；user
    @Update("""
            update t_user set
            user_id=#{user.userId},
            user_name=#{user.userName},
            user_password=#{user.userPassword},
            user_address=#{user.userAddress},
            user_phone=#{user.userPhone},
            user_gender=#{user.userGender},
            user_email=#{user.userEmail}
            where user_id=#{user.userId}
            """)
    int updateUserById(@Param("user") User user);
    //更新；admin
    @Update("""
            update t_admin set
            admin_id=#{admin.adminId},
            admin_username=#{admin.adminUsername},
            admin_password=#{admin.adminPassword}
            where admin_id=#{admin.adminId}
            """)
    int updateAdminById(@Param("admin") Admin admin);
    //根据id查询；user
    @Select("select * from t_user where user_id=#{userId}")
    User inquireUserById(@Param("id") Integer id);
    //根据id查询；admin
    @Select("select * from t_user where user_name=#{userName}")
    User inquireUserByName(@Param("userName") String userName);
    //根据电话号查询；user
    @Select("select * from t_user where user_phone = #{account} or user_email = #{account};")
    User inquireUserByEmailOrPhone(@Param("account") String account);
    //查询全部；admin
    @Select("select * from t_admin;")
    List<Admin> inquireAllAdmin();
    //查询全部；user
    @Select("select * from t_user")
    List<User> inquireAllUsers();
}
