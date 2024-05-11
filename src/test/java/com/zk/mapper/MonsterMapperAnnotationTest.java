package com.zk.mapper;

import com.zk.entity.Monster;
import com.zk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MonsterMapperAnnotationTest {

    private SqlSession sqlSession;
    private MonsterMapperAnnotation monsterMapperAnnotation;

    @Test
    public void addMonster(){
        for (int i = 0; i < 2; i++) {
            //Monster monster = new Monster(18, "zk" + i, "zk" + i + "@qq.com", new Date(), 1000, 1);
            Monster monster = new Monster();
            monster.setAge(999);
            monster.setBirthday(new Date());
            monster.setEmail("a@qq.com");
            monster.setGender(1);
            monster.setName("zk999");
            monster.setSalary(1000);
            monsterMapperAnnotation.addMonster(monster);
            System.out.println("添加对象 = " + monster);
            System.out.println("自增长的id = " + monster.getId());
        }
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
            System.out.println("保存成功");
        }
    }

    @Test
    public void updateMonster(){
        Monster monster = new Monster();
        monster.setId(4);
        monster.setAge(3333);
        monster.setBirthday(new Date());
        monsterMapperAnnotation.updateMonster(monster);
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
            System.out.println("修改成功");
        }
    }

    @Test
    public void findAllMonster(){
        List<Monster> allMonster = monsterMapperAnnotation.findAllMonster();
        for (Monster m : allMonster){
            System.out.println(m);
        }
    }

    //完成初始化任务
    @Before
    public void init(){
        //获取到SqlSession
        sqlSession = MybatisUtils.getSqlSession();
        //获取到MonsterMapper对象
        monsterMapperAnnotation = sqlSession.getMapper(MonsterMapperAnnotation.class);
        System.out.println("monsterMapper = " + monsterMapperAnnotation);
    }

}
