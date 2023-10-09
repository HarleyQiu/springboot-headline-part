package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pojo.Headline;
import com.example.service.HeadlineService;
import com.example.mapper.HeadlineMapper;
import org.springframework.stereotype.Service;

/**
* @author 21055
* @description 针对表【news_headline】的数据库操作Service实现
* @createDate 2023-10-08 17:10:04
*/
@Service
public class HeadlineServiceImpl extends ServiceImpl<HeadlineMapper, Headline>
    implements HeadlineService{

}




