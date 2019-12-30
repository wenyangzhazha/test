package com.wy.test.mapper;

import com.wy.test.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author wenyang
 * @since 2019-12-29
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 根据角色查询用户权限
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenu> selectSysMenuByRoleId(Long roleId);
}
