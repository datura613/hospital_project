package com.datura.yygh.hospital.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:45
 * @Since:jdk1.8
 * @Description:
 */
@Data
@ApiModel(description = "Schedule")
public class ScheduleQueryVo {
	
	@ApiModelProperty(value = "医院编号")
	private String hosCode;

	@ApiModelProperty(value = "科室编号")
	private String depCode;

	@ApiModelProperty(value = "医生编号")
	private String docCode;

	@ApiModelProperty(value = "安排日期")
	private Date workDate;

	@ApiModelProperty(value = "安排时间（0：上午 1：下午）")
	private Integer workTime;

}

