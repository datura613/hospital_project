package com.datura.yygh.hospital.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:42
 * @Since:jdk1.8
 * @Description:用户查询实体
 */

@Data
@ApiModel(description = "用户查询实体")
public class UserQueryVo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "昵称")
    private String nickName;
}
