package com.zk.mapper;

import com.zk.entity.Monster;
import jdk.nashorn.internal.runtime.UserAccessorProperty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.security.cert.TrustAnchor;
import java.util.List;

/**
 * @author 14200
 */
public interface MonsterMapperAnnotation {

    @Update("insert into `monster` ( `age`, `birthday`, `email`, `gender`, `name`, `salary`) " +
            "values (#{age}, #{birthday}, #{email}, #{gender}, #{name}, #{salary});")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void addMonster(Monster monster);

    @Delete("delete from `monster` where `id` = #{id};")
    void deleteMonster(Integer id);

    @Update("UPDATE `monster` set age = #{age}, birthday = #{birthday} where id = #{id};")
    void updateMonster(Monster monster);

    @Update("select * from `monster` where `id` = #{id};")
    Monster getMonsterById(Integer id);

    @Select("select * from `monster`")
    List<Monster> findAllMonster();

}
