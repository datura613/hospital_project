package com.datura.yygh.hospital.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-14:42
 * @Since:jdk1.8
 * @Description:角色查询实体
 */
@Data
@ApiModel(description = "角色查询实体")
public class RoleQueryVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "角色名称")
    private String roleName;
}
