package com.shong.xiong_mybatis_plugin_usage.model;

import com.shong.xiong_mybatis_plugin.annotation.TableField;
import com.shong.xiong_mybatis_plugin.annotation.TableId;
import com.shong.xiong_mybatis_plugin.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("consult_configarea")
public class ConsultConfigArea   {

    @TableId("areaCode")
    public String areaCode;
    @TableField("areaName")
    public String areaName;
    @TableField("state")
    public String state;

    public String getAreaCode() {
        return areaCode;
    }



}
