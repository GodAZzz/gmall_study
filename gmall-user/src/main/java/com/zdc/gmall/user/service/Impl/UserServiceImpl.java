package com.zdc.gmall.user.service.Impl;

import com.zdc.gmall.user.bean.UmsMember;
import com.zdc.gmall.user.bean.UmsMemberReceiveAddress;
import com.zdc.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.zdc.gmall.user.mapper.UserMapper;
import com.zdc.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
       /** Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);**/
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        //return umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }

    @Override
    public String insertUmsMember(UmsMember umsMember) {
        int i = userMapper.insert(umsMember);
        if(i < 1){
            return "insert error";
        }else {
            return "insert success";
        }
    }

    @Override
    public String deleteUmsMember(String id) {
        int i = userMapper.deleteByPrimaryKey(id);
        if(i < 1){
            return "delete error";
        }else {
            return "delete success";
        }
    }

    @Override
    public String updateUmsMember(UmsMember umsMember) {
        int i = userMapper.updateByPrimaryKey(umsMember);
        if(i < 1){
            return "update error";
        }else {
            return "update success";
        }
    }

    @Override
    public UmsMember getUmsMemberById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
