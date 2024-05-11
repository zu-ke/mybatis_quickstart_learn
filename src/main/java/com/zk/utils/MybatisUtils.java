package com.zk.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 14200
 * 工具类，可以得到SqlSession
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    //初始化 sqlSessionFactory
    static {
        try {
            //指定资源文件（配置文件）
            String resource = "mybatis-config.xml";
            //获取配置文件mybatis-config.xml对应的inputStream
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 编写方法，返回SqlSession对象-会话
     * @return
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
