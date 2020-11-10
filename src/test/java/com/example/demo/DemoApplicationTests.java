package com.example.demo;

import com.example.demo.bean.Admin;
import com.example.demo.dao.AdminDao;
import com.example.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void selectAll() {
        SqlSession sqlSession = MybatisUtil.getSqlession();
        AdminDao mapper = sqlSession.getMapper(AdminDao.class);

        List<Admin> admins = mapper.selectAll();

        System.out.println(admins);

        sqlSession.close();

    }

}
