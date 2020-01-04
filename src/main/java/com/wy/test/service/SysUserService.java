package com.wy.test.service;

import com.wy.test.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author wenyang
 * @since 2019-12-29
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 根据用户名查询实体
     * @Author Sans
     * @CreateTime 2019/6/14 16:30
     * @Param  username 用户名
     * @Return SysUser 用户实体
     */
    SysUser selectUserByName(String username);

    /**
    * 新增人员
    *
    * @param: [sysUser]
    * @returns: java.lang.Integer
    * @author: wenyang
    * @date: 2019/12/31
    */
    Integer insertUser(SysUser sysUser);

    /**
    * 判断是否存在用户
    *
    * @param: [sysUser]
    * @returns: java.lang.Integer
    * @author: wenyang
    * @date: 2020/1/1
    */
    SysUser getUser(SysUser sysUser);
}
