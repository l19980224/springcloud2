package com.mysql.mappers.cdbmapper.beans;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Withdraw {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 提现人用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 提现金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    /**
     * 审核失败原因
     */
    @Column(name = "FAIL_REASON")
    private String failReason;

    /**
     * 提现类型，0-微信，1-支付宝
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 创建人
     */
    @Column(name = "CREATER_ID")
    private String createrId;

    /**
     * 提现时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 到账时间
     */
    @Column(name = "ARRIVAL_TIME")
    private Date arrivalTime;

    /**
     * 0-已提交，1-提现成功，2-提现失败
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 到账金额
     */
    @Column(name = "ARRIVAL_AMOUNT")
    private BigDecimal arrivalAmount;

    /**
     * 手续费
     */
    @Column(name = "HANDLING_FEE")
    private BigDecimal handlingFee;

    /**
     * 账户名
     */
    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    /**
     * 第三方ID
     */
    @Column(name = "THIRD_PAY_ID")
    private String thirdPayId;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取提现人用户ID
     *
     * @return USER_ID - 提现人用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置提现人用户ID
     *
     * @param userId 提现人用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取提现金额
     *
     * @return AMOUNT - 提现金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置提现金额
     *
     * @param amount 提现金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取审核失败原因
     *
     * @return FAIL_REASON - 审核失败原因
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * 设置审核失败原因
     *
     * @param failReason 审核失败原因
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    /**
     * 获取提现类型，0-微信，1-支付宝
     *
     * @return TYPE - 提现类型，0-微信，1-支付宝
     */
    public String getType() {
        return type;
    }

    /**
     * 设置提现类型，0-微信，1-支付宝
     *
     * @param type 提现类型，0-微信，1-支付宝
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取提现时间
     *
     * @return CREATE_TIME - 提现时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置提现时间
     *
     * @param createTime 提现时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取到账时间
     *
     * @return ARRIVAL_TIME - 到账时间
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 设置到账时间
     *
     * @param arrivalTime 到账时间
     */
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 获取0-已提交，1-提现成功，2-提现失败
     *
     * @return STATUS - 0-已提交，1-提现成功，2-提现失败
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置0-已提交，1-提现成功，2-提现失败
     *
     * @param status 0-已提交，1-提现成功，2-提现失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取到账金额
     *
     * @return ARRIVAL_AMOUNT - 到账金额
     */
    public BigDecimal getArrivalAmount() {
        return arrivalAmount;
    }

    /**
     * 设置到账金额
     *
     * @param arrivalAmount 到账金额
     */
    public void setArrivalAmount(BigDecimal arrivalAmount) {
        this.arrivalAmount = arrivalAmount;
    }

    /**
     * 获取手续费
     *
     * @return HANDLING_FEE - 手续费
     */
    public BigDecimal getHandlingFee() {
        return handlingFee;
    }

    /**
     * 设置手续费
     *
     * @param handlingFee 手续费
     */
    public void setHandlingFee(BigDecimal handlingFee) {
        this.handlingFee = handlingFee;
    }

    /**
     * 获取账户名
     *
     * @return ACCOUNT_NAME - 账户名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账户名
     *
     * @param accountName 账户名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取第三方ID
     *
     * @return THIRD_PAY_ID - 第三方ID
     */
    public String getThirdPayId() {
        return thirdPayId;
    }

    /**
     * 设置第三方ID
     *
     * @param thirdPayId 第三方ID
     */
    public void setThirdPayId(String thirdPayId) {
        this.thirdPayId = thirdPayId;
    }
}