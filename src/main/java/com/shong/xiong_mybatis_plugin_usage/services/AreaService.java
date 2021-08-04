package com.shong.xiong_mybatis_plugin_usage.services;

import com.shong.xiong_mybatis_plugin_usage.model.ConsultConfigArea;

import java.util.List;

/**
 * @auther 10349 XIONGSY
 * @create 2021/8/3
 */
public interface AreaService {
    List<ConsultConfigArea> selectArea(ConsultConfigArea consultConfigArea);

    List<ConsultConfigArea> selectAreaCondition(ConsultConfigArea consultConfigArea);
}
