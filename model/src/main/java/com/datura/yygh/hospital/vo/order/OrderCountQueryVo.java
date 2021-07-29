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
@ApiModel(description = "OrderCountQueryVo")
public class OrderCountQueryVo {
	
	@ApiModelProperty(value = "医院编号")
	private String hosCode;

	@ApiModelProperty(value = "医院名称")
	private String hosVame;

	@ApiModelProperty(value = "安排日期")
	private String reserveDateBegin;
	private String reserveDateEnd;

}

