package com.wy.test.service;

import com.wy.test.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author wenyang
 * @since 2019-12-29
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * 通过用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/6/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRole> 角色名集合
     */
    List<SysRole> selectSysRoleByUserId(Long userId);

}
