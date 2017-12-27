package cn.exbf.entity.base;

/**
 * 系统函数返回值
 *
 * @author Jiangzx
 * Result：操作结果，true操作成功，false，操作失败
 * RetCode：操作结果代码，一般返回：0：成功，具体代码见实际应用说明
 * RetMsg：结果代码描述，具体代码见实际应用说明
 * Remark：备注信息
 * RetDate:操作日期，格式：yyyy-MM-dd
 * RetTime：操作时间，格式：HH:mm:ss
 * RetSeq：操作流水号
 * RetValue：操作结果参数
 */
public class ReturnMsg {
    public ReturnMsg() {
    }

    /**
     * 操作结果，默认失败
     */
    private boolean result = false;

    /**
     * 操作结果代码
     */
    private String retCode;

    /**
     * 结果代码描述，具体代码见实际应用说明
     */
    private String retMsg;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 操作日期
     */
    private String retDate;

    /**
     * 操作时间
     */
    private String retTime;

    /**
     * 操作流水号
     */
    private String retSeq;

    /**
     * 操作结果参数
     */
    private Object retValue;

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean rst) {
        this.result = rst;
    }


    public String getRetCode() {
        return this.retCode;
    }

    public void setRetCode(String code) {
        this.retCode = code;
    }


    public String getRetMsg() {
        return this.retMsg;
    }

    public void setRetMsg(String msg) {
        this.retMsg = msg;
    }


    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String rmk) {
        this.remark = rmk;
    }


    public String getRetDate() {
        return this.retDate;
    }

    public void setRetDate(String retDate) {
        this.retDate = retDate;
    }


    public String getRetTime() {
        return this.retTime;
    }

    public void setRetTime(String retTime) {
        this.retTime = retTime;
    }


    public String getRetSeq() {
        return this.retSeq;
    }

    public void setRetSeq(String retSeq) {
        this.retSeq = retSeq;
    }


    public Object getRetValue() {
        return this.retValue;
    }

    public void setRetValue(Object value) {
        this.retValue = value;
    }
}
