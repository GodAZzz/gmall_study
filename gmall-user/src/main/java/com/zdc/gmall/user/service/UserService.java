package com.zdc.gmall.user.service;

import com.zdc.gmall.user.bean.UmsMember;
import com.zdc.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    /**
     * 得到所有成员
     * @return
     */
    List<UmsMember> getAllUser();

    /**
     * 根据成员id查询地址
     * @param memberId
     * @return
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    /**
     * 插入UmsMember
     * @param umsMember
     * @return
     */
    String insertUmsMember(UmsMember umsMember);

    /**
     * 根据id删除UmsMember
     * @param id
     * @return
     */
    String deleteUmsMember(String id);

    /**
     * 更新
     * UmsMember
     * @param umsMember
     * @return
     */
    String updateUmsMember(UmsMember umsMember);

    /**
     * 根据id查询UmsMember
     * @param id
     * @return
     */
    UmsMember getUmsMemberById(String id);
}
