package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pojo.Type;
import com.example.service.TypeService;
import com.example.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 21055
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-10-08 17:10:04
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




