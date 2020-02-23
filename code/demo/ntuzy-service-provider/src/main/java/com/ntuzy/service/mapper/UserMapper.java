package com.ntuzy.service.mapper;


import com.ntuzy.service.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author IamZY
 * @create 2020/2/23 16:52
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
