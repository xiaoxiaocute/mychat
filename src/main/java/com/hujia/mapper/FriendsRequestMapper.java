package com.hujia.mapper;

import com.hujia.pojo.FriendsRequest;
import com.hujia.pojo.FriendsRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendsRequestMapper {
    long countByExample(FriendsRequestExample example);

    int deleteByExample(FriendsRequestExample example);

    int deleteByPrimaryKey(String id);

    int insert(FriendsRequest record);

    int insertSelective(FriendsRequest record);

    List<FriendsRequest> selectByExample(FriendsRequestExample example);

    FriendsRequest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    int updateByExample(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    int updateByPrimaryKeySelective(FriendsRequest record);

    int updateByPrimaryKey(FriendsRequest record);
}