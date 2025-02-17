package com.wzc.im.service;

import com.wzc.im.bean.ImGroup;
import com.wzc.im.bean.ImUser;

import java.util.List;

public interface IGroupService {
    
    public int insert(ImGroup group);
    
    public boolean delete(int id);
    
    public boolean update(ImGroup group);
    
    public ImGroup selectById(int id);
    
    public List<ImGroup> selectByCreateId(int id);
    
    public List<ImUser> selectGroupUsers(int gid);
    
    public List<ImGroup> selectByUserId(int id);

}
