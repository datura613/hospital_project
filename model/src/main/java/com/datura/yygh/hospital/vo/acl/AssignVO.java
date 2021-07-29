package com.datura.yygh.hospital.vo.acl;

import lombok.Data;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-11:59
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class AssignVO {
    private Long roleId;
    private Long[] permissionId;
}
