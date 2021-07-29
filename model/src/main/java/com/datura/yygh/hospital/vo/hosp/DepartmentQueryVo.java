package com.datura.yygh.hospital.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:45
 * @Since:jdk1.8
 * @Description:医院信息
 */
@Data
@ApiModel(description = "Department")
public class DepartmentQueryVo {
	
	@ApiModelProperty(value = "医院编号")
	private String hosCode;

	@ApiModelProperty(value = "科室编号")
	private String depCode;

	@ApiModelProperty(value = "科室名称")
	private String depName;

	@ApiModelProperty(value = "大科室编号")
	private String bigCode;

	@ApiModelProperty(value = "大科室名称")
	private String bigName;

}

