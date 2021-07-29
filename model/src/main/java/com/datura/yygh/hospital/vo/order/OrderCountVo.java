package com.datura.yygh.hospital.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:45
 * @Since:jdk1.8
 * @Description:
 */
@Data
@ApiModel(description = "OrderCountVo")
public class OrderCountVo {
	
	@ApiModelProperty(value = "安排日期")
	private String reserveDate;

	@ApiModelProperty(value = "预约单数")
	private Integer count;

}

