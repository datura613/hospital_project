package com.datura.yygh.hospital.enumn;
/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-11:23
 * @Since:jdk1.8
 * @Description:TODO
 */
public enum PaymentStatusEnum {
    UNPAID(1,"支付中"),
    PAID(2,"已支付");
    //REFUND(-1,"已退款");

    private Integer status ;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name ;

    PaymentStatusEnum(Integer status, String name) {
        this.status = status;
        this.name=name;
    }

}
