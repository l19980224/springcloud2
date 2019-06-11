package com.mysql.mappers.cdbmapper.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户昵称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 手机号
     */
    @Column(name = "PHONE_NUM")
    private String phoneNum;

    /**
     * 微信昵称
     */
    @Column(name = "WX_NAME")
    private String wxName;

    /**
     * 微信识别号
     */
    @Column(name = "OPEN_ID")
    private String openId;

    /**
     * 支付宝昵称
     */
    @Column(name = "ALIPAY_NAME")
    private String alipayName;

    /**
     * 支付宝头像
     */
    @Column(name = "ALIPAY_LOG")
    private String alipayLog;

    /**
     * 微信头像
     */
    @Column(name = "WX_LOG")
    private String wxLog;

    /**
     * 性别，1-男，2-女
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 出生年月
     */
    @Column(name = "BIRTHDAY")
    private String birthday;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 所属平台ID
     */
    @Column(name = "PLATFORM_ID")
    private String platformId;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private Date createdTime;

    @Column(name = "UNIONID")
    private String unionid;

    /**
     * 获取编号
     *
     * @return ID - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户昵称
     *
     * @return NICK_NAME - 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户昵称
     *
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取手机号
     *
     * @return PHONE_NUM - 手机号
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号
     *
     * @param phoneNum 手机号
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取微信昵称
     *
     * @return WX_NAME - 微信昵称
     */
    public String getWxName() {
        return wxName;
    }

    /**
     * 设置微信昵称
     *
     * @param wxName 微信昵称
     */
    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    /**
     * 获取微信识别号
     *
     * @return OPEN_ID - 微信识别号
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信识别号
     *
     * @param openId 微信识别号
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取支付宝昵称
     *
     * @return ALIPAY_NAME - 支付宝昵称
     */
    public String getAlipayName() {
        return alipayName;
    }

    /**
     * 设置支付宝昵称
     *
     * @param alipayName 支付宝昵称
     */
    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    /**
     * 获取支付宝头像
     *
     * @return ALIPAY_LOG - 支付宝头像
     */
    public String getAlipayLog() {
        return alipayLog;
    }

    /**
     * 设置支付宝头像
     *
     * @param alipayLog 支付宝头像
     */
    public void setAlipayLog(String alipayLog) {
        this.alipayLog = alipayLog;
    }

    /**
     * 获取微信头像
     *
     * @return WX_LOG - 微信头像
     */
    public String getWxLog() {
        return wxLog;
    }

    /**
     * 设置微信头像
     *
     * @param wxLog 微信头像
     */
    public void setWxLog(String wxLog) {
        this.wxLog = wxLog;
    }

    /**
     * 获取性别，1-男，2-女
     *
     * @return SEX - 性别，1-男，2-女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别，1-男，2-女
     *
     * @param sex 性别，1-男，2-女
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取出生年月
     *
     * @return BIRTHDAY - 出生年月
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置出生年月
     *
     * @param birthday 出生年月
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取所属平台ID
     *
     * @return PLATFORM_ID - 所属平台ID
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * 设置所属平台ID
     *
     * @param platformId 所属平台ID
     */
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_TIME - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return UNIONID
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * @param unionid
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}