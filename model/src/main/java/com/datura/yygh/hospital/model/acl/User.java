package com.datura.yygh.hospital.model.acl;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.datura.yygh.hospital.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-11:32
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@ApiModel(description = "用户")
@TableName("acl_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户名")
	@TableField("username")
	private String username;

	@ApiModelProperty(value = "密码")
	@TableField("password")
	private String password;

	@ApiModelProperty(value = "昵称")
	@TableField("nick_name")
	private String nickName;

	@ApiModelProperty(value = "用户头像")
	@TableField("salt")
	private String salt;

	@ApiModelProperty(value = "用户签名")
	@TableField("token")
	private String token;

}



