package com.datura.yygh.hospital.vo.msm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:45
 * @Since:jdk1.8
 * @Description:
 */
@Data
@ApiModel(description = "短信实体")
public class MsmVo {

    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "短信模板code")
    private String templateCode;

    @ApiModelProperty(value = "短信模板参数")
    private Map<String,Object> param;
}
