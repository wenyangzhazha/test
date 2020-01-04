package com.wy.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wy.test.entity.SysUser;
import com.wy.test.mapper.SysUserMapper;
import com.wy.test.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author wenyang
 * @since 2019-12-29
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser selectUserByName(String username) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUser::getUsername,username);
        return this.baseMapper.selectOne(queryWrapper);
    }

    /**
    * 新增用户
    *
    * @param: [sysUser]
    * @returns: java.lang.Integer
    * @author: wenyang
    * @date: 2019/12/31
    */
    public Integer insertUser(SysUser sysUser){
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public SysUser getUser(SysUser sysUser) {

        QueryWrapper<SysUser> ew = new QueryWrapper<>();
        ew.eq("username",sysUser.getUsername())
                .eq("password",sysUser.getPassword());
        SysUser user = sysUserMapper.selectOne(ew);
        return user;
    }


}
