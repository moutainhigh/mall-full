package com.edward.gmall.user.mapper;

import com.edward.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper  {
    List<UmsMember> selectAllUser();

}
