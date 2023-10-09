package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pojo.User;
import com.example.service.UserService;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 21055
* @description 针对表【news_user】的数据库操作Service实现
* @createDate 2023-10-08 17:10:04
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




