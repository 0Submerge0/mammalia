package com.org.mammalia.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * MyBatis框架的工具类,用于获取SqlSession实例
 * 简化MyBatis的使用
 */
public final class MybatisUtil {
    private MybatisUtil(){}
    public static SqlSession getSqlSession(String resourcePath){
        Reader reader;
        SqlSession session = null;
        try {
            reader = Resources.getResourceAsReader(resourcePath);
            SqlSessionFactory factory = new
                    SqlSessionFactoryBuilder().build(reader);
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }
}

