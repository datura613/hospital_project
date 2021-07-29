package com.datura.yygh.hospital.enumn;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-11:24
 * @Since:jdk1.8
 * @Description:TODO
 */
public enum PaymentTypeEnum {
    ALIPAY(1,"支付宝"),
    WEIXIN(2,"微信" );

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private Integer status ;
    private String comment ;


    PaymentTypeEnum(Integer status, String comment ){
        this.status = status;
        this.comment=comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
