package com.shong.xiong_mybatis_plugin_usage;

import com.shong.xiong_mybatis_plugin_usage.model.ConsultConfigArea;
import com.shong.xiong_mybatis_plugin_usage.services.AreaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class XiongMybatisPluginUsageApplicationTests {

    @Autowired
    private AreaService areaService;

    @Test
    void contextLoads() {
    }

    @Test
    void areaSelectTest() {
        ConsultConfigArea consultConfigArea = new ConsultConfigArea();
        consultConfigArea.setAreaName("德安");
        List<ConsultConfigArea> consultConfigAreas = areaService.selectArea(consultConfigArea);
        System.out.println(consultConfigAreas);
    }
    @Test
    void areaConditionSelectTest() {
        ConsultConfigArea consultConfigArea = new ConsultConfigArea();
        consultConfigArea.setAreaName("德安");
        consultConfigArea.setAreaCode("030400");
        List<ConsultConfigArea> consultConfigAreas = areaService.selectAreaCondition(consultConfigArea);
        System.out.println(consultConfigAreas);
    }

}
