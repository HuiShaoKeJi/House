package com.github.houes.test;


import com.github.houes.dao.UserMapper;
import com.github.houes.pojo.SysUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        try {
            //1.加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //2.通过sqlSessionFactory工厂加工一个sqlSession
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //3.开启会话
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //为接口创建对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.getUserList();

            //查询所有用户

            for (SysUser sysUser : userList){
                System.out.println("用户id"+sysUser.getUID());
                System.out.println("用户名:"+sysUser.getuName());
                System.out.println("密码:"+sysUser.getuPassWord());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
