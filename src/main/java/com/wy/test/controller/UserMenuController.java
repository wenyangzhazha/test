package com.wy.test.controller;

import com.wy.test.entity.SysMenu;
import com.wy.test.entity.SysRole;
import com.wy.test.entity.SysRoleMenu;
import com.wy.test.entity.SysUser;
import com.wy.test.service.SysMenuService;
import com.wy.test.service.SysRoleMenuService;
import com.wy.test.service.SysRoleService;
import com.wy.test.service.SysUserService;
import com.wy.test.util.ShiroUtils;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 权限测试
 * @Author Sans
 * @CreateTime 2019/6/19 11:38
 */
@RestController
@RequestMapping("/menu")
@Api(tags = "菜单测试")
public class UserMenuController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 获取用户信息集合
     * @Author Sans
     * @CreateTime 2019/6/19 10:36
     * @Return Map<String,Object> 返回结果
     */
    @PostMapping("/getUserInfoList")
    @RequiresPermissions("sys:user:info")
    public Map<String,Object> getUserInfoList(){
        Map<String,Object> map = new HashMap<>();
        List<SysUser> SysUserList = sysUserService.list();
        map.put("SysUserList",SysUserList);
        return map;
    }

    /**
     * 获取角色信息集合
     * @Author Sans
     * @CreateTime 2019/6/19 10:37
     * @Return Map<String,Object> 返回结果
     */
    @PostMapping("/getRoleInfoList")
    @RequiresPermissions("sys:role:info")
    public Map<String,Object> getRoleInfoList(){
        Map<String,Object> map = new HashMap<>();
        List<SysRole> SysRoleList = sysRoleService.list();
        map.put("SysRoleList",SysRoleList);
        return map;
    }

    /**
     * 获取权限信息集合
     * @Author Sans
     * @CreateTime 2019/6/19 10:38
     * @Return Map<String,Object>
     */
    @PostMapping("/getMenuInfoList")
    @RequiresPermissions("sys:menu:info")
    public Map<String,Object> getMenuInfoList(){
        Map<String,Object> map = new HashMap<>();
        List<SysMenu> SysMenuList = sysMenuService.list();
        map.put("SysMenuList",SysMenuList);
        return map;
    }

    /**
     * 获取所有数据
     * @Author Sans
     * @CreateTime 2019/6/19 10:38
     * @Return Map<String,Object>
     */
    @PostMapping("/getInfoAll")
    @RequiresPermissions("sys:info:all")
    public Map<String,Object> getInfoAll(){
        Map<String,Object> map = new HashMap<>();
        List<SysUser> SysUserList = sysUserService.list();
        map.put("SysUserList",SysUserList);
        List<SysRole> SysRoleList = sysRoleService.list();
        map.put("SysRoleList",SysRoleList);
        List<SysMenu> SysMenuList = sysMenuService.list();
        map.put("SysMenuList",SysMenuList);
        return map;
    }

    /**
     * 添加管理员角色权限(测试动态权限更新)
     * @Author Sans
     * @CreateTime 2019/6/19 10:39
     * @Param  username 用户ID
     * @Return Map<String,Object>
     */
    @PostMapping("/addMenu")
    public Map<String,Object> addMenu(){
        //添加管理员角色权限
        SysRoleMenu sysRoleMenuEntity = new SysRoleMenu();
        sysRoleMenuEntity.setMenuId(4L);
        sysRoleMenuEntity.setRoleId(1L);
        sysRoleMenuService.save(sysRoleMenuEntity);
        //清除缓存
        String username = "admin";
        ShiroUtils.deleteCache(username,false);
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg","权限添加成功");
        return map;
    }
}