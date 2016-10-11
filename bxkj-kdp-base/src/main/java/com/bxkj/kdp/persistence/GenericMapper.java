package com.bxkj.kdp.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GenericMapper<E,T extends Domain> {
	

    long countByExample(E e);	

    int deleteByExample(E e);

    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    List<T> selectByExampleWithBLOBs(E e);

    List<T> selectByExample(E e);

    T selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") T t, @Param("example") E e);

    int updateByExampleWithBLOBs(@Param("record") T t, @Param("example") E e);

    int updateByExample(@Param("record") T t, @Param("example") E e);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKeyWithBLOBs(T t);

    int updateByPrimaryKey(T t);

    
}