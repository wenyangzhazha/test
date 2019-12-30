package com.wy.test.service;

import com.wy.test.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author wenyang
 * @since 2019-12-29
 */
public interface SysMenuService extends IService<SysMenu> {

    /**
     * 根据角色查询用户权限
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenu> 权限集合
     */
    List<SysMenu> selectSysMenuByRoleId(Long roleId);

}
