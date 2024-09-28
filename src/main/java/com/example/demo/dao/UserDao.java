package com.example.demo.dao;

import com.example.demo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zqm
 * @since 2024-09-19
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
