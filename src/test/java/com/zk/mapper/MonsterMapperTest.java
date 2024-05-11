package com.zk.mapper;

import com.zk.entity.Monster;
import com.zk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MonsterMapperTest {

    private SqlSession sqlSession;
    private MonsterMapper monsterMapper;

    @Test
    public void findAllMonster(){
        List<Monster> allMonster = monsterMapper.findAllMonster();
        System.out.println("allMonster = " + allMonster);
        if (sqlSession != null) {
            sqlSession.close();
            System.out.println("查询成功");
        }
    }

    @Test
    public void getMonsterById(){
        Monster monster = monsterMapper.getMonsterById(3);
        System.out.println("monster = " + monster);
        if (sqlSession != null) {
            sqlSession.close();
            System.out.println("查询成功");
        }
    }

    @Test
    public void updateMonster(){
        Monster monster = new Monster();
        monster.setId(4);
        monster.setAge(18);
        monster.setBirthday(new Date());
        monsterMapper.updateMonster(monster);
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
            System.out.println("修改成功");
        }
    }

    @Test
    public void deleteMonster(){
        monsterMapper.deleteMonster(2);
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
            System.out.println("删除成功");
        }
    }

    @Test
    public void addMonster(){
        for (int i = 0; i < 2; i++) {
            //Monster monster = new Monster(18, "zk" + i, "zk" + i + "@qq.com", new Date(), 1000, 1);
            Monster monster = new Monster();
            monster.setAge(18);
            monster.setBirthday(new Date());
            monster.setEmail("a@qq.com");
            monster.setGender(1);
            monster.setName("zk");
            monster.setSalary(1000);
            monsterMapper.addMonster(monster);
            System.out.println("添加对象 = " + monster);
            System.out.println("自增长的id = " + monster.getId());
        }
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
            System.out.println("保存成功");
        }
    }

    //完成初始化任务
    @Before
    public void init(){
        //获取到SqlSession
        sqlSession = MybatisUtils.getSqlSession();
        //获取到MonsterMapper对象
        monsterMapper = sqlSession.getMapper(MonsterMapper.class);
        System.out.println("monsterMapper = " + monsterMapper);
    }

}
