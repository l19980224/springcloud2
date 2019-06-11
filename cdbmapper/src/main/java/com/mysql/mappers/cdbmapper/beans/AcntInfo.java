package com.mysql.mappers.cdbmapper.beans;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "acnt_info")
public class AcntInfo {
    /**
     * 账户 2位账户类型+时间戳分布式编号
     */
    @Id
    @Column(name = "ACNT_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String acntNo;

    /**
     * 上级账户
     */
    @Column(name = "PARENTS_ACNT_NO")
    private String parentsAcntNo;

    /**
     * 账户姓名
     */
    @Column(name = "ACNT_NAME")
    private String acntName;

    /**
     * 支付密码
     */
    @Column(name = "ACNT_PWD")
    private String acntPwd;

    /**
     * 客户号
     */
    @Column(name = "CUST_ID")
    private String custId;

    /**
     * 客户名称
     */
    @Column(name = "CUST_NAME")
    private String custName;

    /**
     * 客户类型
     */
    @Column(name = "CUST_TYPE")
    private String custType;

    /**
     * 账户余额
     */
    @Column(name = "ACNT_BALAN")
    private BigDecimal acntBalan;

    /**
     * 可用余额
     */
    @Column(name = "AVAIL_BALAN")
    private BigDecimal availBalan;

    /**
     * 冻结金额
     */
    @Column(name = "FREEZE_BALAN")
    private BigDecimal freezeBalan;

    /**
     * 账户所属类型1-个人 2-机构 3-内部

     */
    @Column(name = "ACNT_BELONGS_TO")
    private String acntBelongsTo;

    /**
     * 账户状态，0-正常，1-挂失，2-销户，3-冻结
     */
    @Column(name = "ACNT_STATE")
    private String acntState;

    /**
     * 证件类型
     */
    @Column(name = "ID_TYPE")
    private String idType;

    /**
     * 证件号码
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 固定电话
     */
    @Column(name = "OFFICE_NO")
    private String officeNo;

    /**
     * 手机号码
     */
    @Column(name = "MOBILE_NO")
    private String mobileNo;

    /**
     * 电子邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 开户渠道
     */
    @Column(name = "CHANNEL_CODE")
    private String channelCode;

    /**
     * 销户日期yyyyMMdd
     */
    @Column(name = "CANCEL_DATE")
    private String cancelDate;

    /**
     * 是否可透支0-不可透支 1-可透支

     */
    @Column(name = "IF_OVERDRAW")
    private String ifOverdraw;

    /**
     * 开户日期yyyyMMdd
     */
    @Column(name = "OPEN_DATE")
    private String openDate;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建人
     */
    @Column(name = "CREATER_ID")
    private String createrId;

    /**
     * 创建日期yyyyMMdd
     */
    @Column(name = "CREATE_DATE")
    private String createDate;

    /**
     * 创建时间hhmmss
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 修改人
     */
    @Column(name = "UPDATE_ID")
    private String updateId;

    /**
     * 修改日期yyyyMMdd
     */
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    /**
     * 修改时间hhmmss
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 内部账户类型，0-收益账户，1-支出账户
     */
    @Column(name = "ACNT_TYPE")
    private String acntType;

    /**
     * 平台编号
     */
    @Column(name = "PLATFORM_ID")
    private String platformId;

    /**
     * 获取账户 2位账户类型+时间戳分布式编号
     *
     * @return ACNT_NO - 账户 2位账户类型+时间戳分布式编号
     */
    public String getAcntNo() {
        return acntNo;
    }

    /**
     * 设置账户 2位账户类型+时间戳分布式编号
     *
     * @param acntNo 账户 2位账户类型+时间戳分布式编号
     */
    public void setAcntNo(String acntNo) {
        this.acntNo = acntNo;
    }

    /**
     * 获取上级账户
     *
     * @return PARENTS_ACNT_NO - 上级账户
     */
    public String getParentsAcntNo() {
        return parentsAcntNo;
    }

    /**
     * 设置上级账户
     *
     * @param parentsAcntNo 上级账户
     */
    public void setParentsAcntNo(String parentsAcntNo) {
        this.parentsAcntNo = parentsAcntNo;
    }

    /**
     * 获取账户姓名
     *
     * @return ACNT_NAME - 账户姓名
     */
    public String getAcntName() {
        return acntName;
    }

    /**
     * 设置账户姓名
     *
     * @param acntName 账户姓名
     */
    public void setAcntName(String acntName) {
        this.acntName = acntName;
    }

    /**
     * 获取支付密码
     *
     * @return ACNT_PWD - 支付密码
     */
    public String getAcntPwd() {
        return acntPwd;
    }

    /**
     * 设置支付密码
     *
     * @param acntPwd 支付密码
     */
    public void setAcntPwd(String acntPwd) {
        this.acntPwd = acntPwd;
    }

    /**
     * 获取客户号
     *
     * @return CUST_ID - 客户号
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置客户号
     *
     * @param custId 客户号
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 获取客户名称
     *
     * @return CUST_NAME - 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置客户名称
     *
     * @param custName 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取客户类型
     *
     * @return CUST_TYPE - 客户类型
     */
    public String getCustType() {
        return custType;
    }

    /**
     * 设置客户类型
     *
     * @param custType 客户类型
     */
    public void setCustType(String custType) {
        this.custType = custType;
    }

    /**
     * 获取账户余额
     *
     * @return ACNT_BALAN - 账户余额
     */
    public BigDecimal getAcntBalan() {
        return acntBalan;
    }

    /**
     * 设置账户余额
     *
     * @param acntBalan 账户余额
     */
    public void setAcntBalan(BigDecimal acntBalan) {
        this.acntBalan = acntBalan;
    }

    /**
     * 获取可用余额
     *
     * @return AVAIL_BALAN - 可用余额
     */
    public BigDecimal getAvailBalan() {
        return availBalan;
    }

    /**
     * 设置可用余额
     *
     * @param availBalan 可用余额
     */
    public void setAvailBalan(BigDecimal availBalan) {
        this.availBalan = availBalan;
    }

    /**
     * 获取冻结金额
     *
     * @return FREEZE_BALAN - 冻结金额
     */
    public BigDecimal getFreezeBalan() {
        return freezeBalan;
    }

    /**
     * 设置冻结金额
     *
     * @param freezeBalan 冻结金额
     */
    public void setFreezeBalan(BigDecimal freezeBalan) {
        this.freezeBalan = freezeBalan;
    }

    /**
     * 获取账户所属类型1-个人 2-机构 3-内部

     *
     * @return ACNT_BELONGS_TO - 账户所属类型1-个人 2-机构 3-内部

     */
    public String getAcntBelongsTo() {
        return acntBelongsTo;
    }

    /**
     * 设置账户所属类型1-个人 2-机构 3-内部

     *
     * @param acntBelongsTo 账户所属类型1-个人 2-机构 3-内部

     */
    public void setAcntBelongsTo(String acntBelongsTo) {
        this.acntBelongsTo = acntBelongsTo;
    }

    /**
     * 获取账户状态，0-正常，1-挂失，2-销户，3-冻结
     *
     * @return ACNT_STATE - 账户状态，0-正常，1-挂失，2-销户，3-冻结
     */
    public String getAcntState() {
        return acntState;
    }

    /**
     * 设置账户状态，0-正常，1-挂失，2-销户，3-冻结
     *
     * @param acntState 账户状态，0-正常，1-挂失，2-销户，3-冻结
     */
    public void setAcntState(String acntState) {
        this.acntState = acntState;
    }

    /**
     * 获取证件类型
     *
     * @return ID_TYPE - 证件类型
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置证件类型
     *
     * @param idType 证件类型
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * 获取证件号码
     *
     * @return ID_NO - 证件号码
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置证件号码
     *
     * @param idNo 证件号码
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 获取固定电话
     *
     * @return OFFICE_NO - 固定电话
     */
    public String getOfficeNo() {
        return officeNo;
    }

    /**
     * 设置固定电话
     *
     * @param officeNo 固定电话
     */
    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }

    /**
     * 获取手机号码
     *
     * @return MOBILE_NO - 手机号码
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置手机号码
     *
     * @param mobileNo 手机号码
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 获取电子邮箱
     *
     * @return EMAIL - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取开户渠道
     *
     * @return CHANNEL_CODE - 开户渠道
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 设置开户渠道
     *
     * @param channelCode 开户渠道
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    /**
     * 获取销户日期yyyyMMdd
     *
     * @return CANCEL_DATE - 销户日期yyyyMMdd
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * 设置销户日期yyyyMMdd
     *
     * @param cancelDate 销户日期yyyyMMdd
     */
    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    /**
     * 获取是否可透支0-不可透支 1-可透支

     *
     * @return IF_OVERDRAW - 是否可透支0-不可透支 1-可透支

     */
    public String getIfOverdraw() {
        return ifOverdraw;
    }

    /**
     * 设置是否可透支0-不可透支 1-可透支

     *
     * @param ifOverdraw 是否可透支0-不可透支 1-可透支

     */
    public void setIfOverdraw(String ifOverdraw) {
        this.ifOverdraw = ifOverdraw;
    }

    /**
     * 获取开户日期yyyyMMdd
     *
     * @return OPEN_DATE - 开户日期yyyyMMdd
     */
    public String getOpenDate() {
        return openDate;
    }

    /**
     * 设置开户日期yyyyMMdd
     *
     * @param openDate 开户日期yyyyMMdd
     */
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建人
     *
     * @return CREATER_ID - 创建人
     */
    public String getCreaterId() {
        return createrId;
    }

    /**
     * 设置创建人
     *
     * @param createrId 创建人
     */
    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    /**
     * 获取创建日期yyyyMMdd
     *
     * @return CREATE_DATE - 创建日期yyyyMMdd
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期yyyyMMdd
     *
     * @param createDate 创建日期yyyyMMdd
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建时间hhmmss
     *
     * @return CREATE_TIME - 创建时间hhmmss
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间hhmmss
     *
     * @param createTime 创建时间hhmmss
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人
     *
     * @return UPDATE_ID - 修改人
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * 设置修改人
     *
     * @param updateId 修改人
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * 获取修改日期yyyyMMdd
     *
     * @return UPDATE_DATE - 修改日期yyyyMMdd
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改日期yyyyMMdd
     *
     * @param updateDate 修改日期yyyyMMdd
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取修改时间hhmmss
     *
     * @return UPDATE_TIME - 修改时间hhmmss
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间hhmmss
     *
     * @param updateTime 修改时间hhmmss
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取内部账户类型，0-收益账户，1-支出账户
     *
     * @return ACNT_TYPE - 内部账户类型，0-收益账户，1-支出账户
     */
    public String getAcntType() {
        return acntType;
    }

    /**
     * 设置内部账户类型，0-收益账户，1-支出账户
     *
     * @param acntType 内部账户类型，0-收益账户，1-支出账户
     */
    public void setAcntType(String acntType) {
        this.acntType = acntType;
    }

    /**
     * 获取平台编号
     *
     * @return PLATFORM_ID - 平台编号
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * 设置平台编号
     *
     * @param platformId 平台编号
     */
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }
}