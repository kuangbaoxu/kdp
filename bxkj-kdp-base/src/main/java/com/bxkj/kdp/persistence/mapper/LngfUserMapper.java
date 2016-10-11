package com.bxkj.kdp.persistence.mapper;

import com.bxkj.kdp.persistence.GenericMapper;
import com.bxkj.kdp.persistence.domain.LngfUser;
import com.bxkj.kdp.persistence.domain.LngfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LngfUserMapper extends GenericMapper<LngfUserExample, LngfUser> {
    long countByExample(LngfUserExample example);

    int deleteByExample(LngfUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LngfUser record);

    int insertSelective(LngfUser record);

    List<LngfUser> selectByExample(LngfUserExample example);

    LngfUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LngfUser record, @Param("example") LngfUserExample example);

    int updateByExample(@Param("record") LngfUser record, @Param("example") LngfUserExample example);

    int updateByPrimaryKeySelective(LngfUser record);

    int updateByPrimaryKey(LngfUser record);
}