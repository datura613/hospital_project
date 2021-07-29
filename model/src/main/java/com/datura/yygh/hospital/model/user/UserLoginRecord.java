package com.datura.yygh.hospital.model.user;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.datura.yygh.hospital.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-11:40
 * @Since:jdk1.8
 * @Description:用户登录日志
 */
@Data
@ApiModel(description = "用户登录日志")
@TableName("user_login_record")
public class UserLoginRecord extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "用户id")
	@TableField("user_id")
	private Long userId;

	@ApiModelProperty(value = "ip")
	@TableField("ip")
	private String ip;

}

