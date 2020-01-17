package com.zdc.gmall.user.mapper;

import com.zdc.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 使用通用mapper
 */

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
