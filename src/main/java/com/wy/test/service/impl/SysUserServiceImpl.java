package com.wy.test.service.impl;

import com.wy.test.entity.SysUser;
import com.wy.test.mapper.SysUserMapper;
import com.wy.test.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
