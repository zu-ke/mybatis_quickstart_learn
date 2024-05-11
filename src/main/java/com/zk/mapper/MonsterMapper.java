package com.zk.mapper;

import com.zk.entity.Monster;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 14200
 */
public interface MonsterMapper {

    void addMonster(Monster monster);

    void deleteMonster(Integer id);

    void updateMonster(Monster monster);

    Monster getMonsterById(Integer id);

    List<Monster> findAllMonster();

}
