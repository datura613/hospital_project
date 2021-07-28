package com.datura.hospital.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/28-17:15
 * @Since:jdk1.8
 * @Description:自定义全局异常类
 */
@Data
@ApiModel(value = "自定义全局异常类")
public class HospitalException extends RuntimeException{
   @ApiModelProperty(value = "异常状态码")
   private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param message
     * @param code
     */
   public HospitalException(String message,Integer code){
       super(message);
       this.code = code;
   }
   public HospitalException(){

   }
}
