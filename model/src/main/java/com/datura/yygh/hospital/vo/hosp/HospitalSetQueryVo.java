package com.datura.yygh.hospital.vo.hosp;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class HospitalSetQueryVo {

    @ApiModelProperty(value = "医院名称")
    private String hosName;

    @ApiModelProperty(value = "医院编号")
    private String hosCode;
}
