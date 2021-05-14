package com.jk.dao;

import com.jk.entity.PhoneEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PhoneDao {

    int findCount(@Param("phone")PhoneEntity phone);

    List<PhoneEntity> find(@Param("start") int start, @Param("phone")PhoneEntity phone);


    @Insert("insert into t_phone (name,price,type,size,date) values (#{name},#{price},#{type},#{size},#{date}) ")
    void add(PhoneEntity phone);

    @Update("update t_phone set name = #{name},price = #{price},type = #{type},date = #{date},size = #{size} where id = #{id}")
    void update(PhoneEntity phone);

    @Delete("delete from t_phone where id = #{id}")
    void del(Integer id);

    @Select("select * from t_phone where id = #{id}")
    PhoneEntity findById(Integer id);
}
