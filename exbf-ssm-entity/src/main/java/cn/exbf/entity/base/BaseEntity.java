package cn.exbf.entity.base;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:
 * 公用实体对象基类
 *
 * @author ShenFang
 * @create 2017-12-22 10:31
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 5908489787919929004L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 创建人
     */
    private Long creator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 状态
     */
    private Long status;
    /**
     * 审核状态
     */
    private Long audStatus;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 审核记录ID
     */
    private Long audRecordId;
    /**
     * 操作类型
     */
    private Long type;
    /**
     * 审核人ID
     */
    private Long auditor;
    /**
     * 审核时间
     */
    private Date audTime;
    /**
     * 审核意见(描述)
     */
    private String audDesc;
    /**
     * 前一次审核记录ID
     */
    private Long preAudId;
    /**
     * 前一次审核通过记录ID
     */
    private Long preSucAudId;

    /**
     * 系统操作流水号，全局唯一，所有表都要有该字段
     */
    private String sysOperateSerialNo;
    /**
     * 创建者，字符型，用于系统生成的数据记录
     */
    private String creater;

    //以下 ====查询用 =====

    /**
     * 页面相关信息
     */
    private PageInfo pageInfo = new PageInfo();

    /**
     * 开始时间
     */
    private Date qryBeginDateTime;
    /**
     * 结束时间
     */
    private Date qryEndDateTime;


    public Long getAudRecordId() {
        return audRecordId;
    }

    public void setAudRecordId(Long audRecordId) {
        this.audRecordId = audRecordId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getAudStatus() {
        return audStatus;
    }

    public void setAudStatus(Long audStatus) {
        this.audStatus = audStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getAuditor() {
        return auditor;
    }

    public void setAuditor(Long auditor) {
        this.auditor = auditor;
    }

    public Date getAudTime() {
        return audTime;
    }

    public void setAudTime(Date audTime) {
        this.audTime = audTime;
    }

    public String getAudDesc() {
        return audDesc;
    }

    public void setAudDesc(String audDesc) {
        this.audDesc = audDesc;
    }

    public Long getPreAudId() {
        return preAudId;
    }

    public void setPreAudId(Long preAudId) {
        this.preAudId = preAudId;
    }

    public Long getPreSucAudId() {
        return preSucAudId;
    }

    public void setPreSucAudId(Long preSucAudId) {
        this.preSucAudId = preSucAudId;
    }

    public String getSysOperateSerialNo() {
        return sysOperateSerialNo;
    }

    public void setSysOperateSerialNo(String sysOperateSerialNo) {
        this.sysOperateSerialNo = sysOperateSerialNo;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getQryBeginDateTime() {
        return qryBeginDateTime;
    }

    public void setQryBeginDateTime(Date qryBeginDateTime) {
        this.qryBeginDateTime = qryBeginDateTime;
    }

    public Date getQryEndDateTime() {
        return qryEndDateTime;
    }

    public void setQryEndDateTime(Date qryEndDateTime) {
        this.qryEndDateTime = qryEndDateTime;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
