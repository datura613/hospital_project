package com.datura.yygh.hospital.enumn;

/**
 * @Author：li
 * @Version：1.0
 * @Date：2021/7/29-11:12
 * @Since:jdk1.8
 * @Description:TODO
 */
public enum DictEnum {
    HOSTYPE("Hostype", "医院等级"),
    CERTIFICATES_TYPE("CertificatesType", "证件类型"),
    ;

    private String dictCode;
    private String msg;

    DictEnum(String dictCode, String msg) {
        this.dictCode = dictCode;
        this.msg = msg;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
