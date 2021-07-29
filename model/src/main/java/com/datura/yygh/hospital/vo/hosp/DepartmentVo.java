package com.datura.yygh.hospital.vo.hosp;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:45
 * @Since:jdk1.8
 * @Description:科室信息
 */
@Data
@ApiModel(description = "Department")
public class DepartmentVo {

	@ApiModelProperty(value = "科室编号")
	private String depCode;

	@ApiModelProperty(value = "科室名称")
	private String depName;

	@ApiModelProperty(value = "下级节点")
	private List<DepartmentVo> children;

}

