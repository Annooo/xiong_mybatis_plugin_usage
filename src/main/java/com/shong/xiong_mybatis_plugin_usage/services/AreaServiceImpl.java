package com.shong.xiong_mybatis_plugin_usage.services;

import com.shong.xiong_mybatis_plugin.condition.SqlCondition;
import com.shong.xiong_mybatis_plugin_usage.mapper.CommonMapper;
import com.shong.xiong_mybatis_plugin_usage.model.ConsultConfigArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 10349 XIONGSY
 * @create 2021/8/3
 */
@Slf4j
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private CommonMapper commonMapper;

    @Override
    public List<ConsultConfigArea> selectArea(ConsultConfigArea consultConfigArea) {
        List<ConsultConfigArea> consultConfigAreas = commonMapper.dynamicSelect(consultConfigArea);
        log.info("consultConfigAreas = {} ", consultConfigAreas);
        return consultConfigAreas;
    }

    @Override
    public List<ConsultConfigArea> selectAreaCondition(ConsultConfigArea consultConfigArea) {
        SqlCondition sqlCondition = new SqlCondition();
        sqlCondition
                .eq("areaName", consultConfigArea.getAreaName())
                .or().eq("areaCode", consultConfigArea.getAreaCode())
                .orderBy("areaName","desc")
                .orderBy("state","asc");
        List<ConsultConfigArea> consultConfigAreas = commonMapper.selectByCondition(sqlCondition);
        log.info("consultConfigAreas = {} ", consultConfigAreas);
        return consultConfigAreas;
    }
}
