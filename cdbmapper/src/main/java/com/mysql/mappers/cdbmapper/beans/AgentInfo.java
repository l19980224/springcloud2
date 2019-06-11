package com.mysql.mappers.cdbmapper.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "agent_info")
public class AgentInfo {
    /**
     * 代理编号 代理编号
     */
    @Id
    @Column(name = "AGENT_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String agentNo;

    /**
     * 代理名称
     */
    @Column(name = "AGENT_NAME")
    private String agentName;

    /**
     * 登录账号 登录账号
     */
    @Column(name = "HEAD_IMG_URL")
    private String headImgUrl;

    /**
     * 状态，1-有效，2-无效
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 1-一级合伙人 2-二级合伙人 3-商家
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 代理手机
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 分成比例
     */
    @Column(name = "PROPORTION")
    private String proportion;

    /**
     * 真实姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 是否删除，0-正常，1-删除
     */
    @Column(name = "IS_DELETE")
    private String isDelete;

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 成为代理时间
     */
    @Column(name = "UPGRADE_AGENT_TIME")
    private Date upgradeAgentTime;

    /**
     * 平台编号
     */
    @Column(name = "PLATFORM_ID")
    private String platformId;

    /**
     * 创建人
     */
    @Column(name = "CREATER_ID")
    private String createrId;

    /**
     * 获取代理编号 代理编号
     *
     * @return AGENT_NO - 代理编号 代理编号
     */
    public String getAgentNo() {
        return agentNo;
    }

    /**
     * 设置代理编号 代理编号
     *
     * @param agentNo 代理编号 代理编号
     */
    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    /**
     * 获取代理名称
     *
     * @return AGENT_NAME - 代理名称
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置代理名称
     *
     * @param agentName 代理名称
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * 获取登录账号 登录账号
     *
     * @return HEAD_IMG_URL - 登录账号 登录账号
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * 设置登录账号 登录账号
     *
     * @param headImgUrl 登录账号 登录账号
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    /**
     * 获取状态，1-有效，2-无效
     *
     * @return STATUS - 状态，1-有效，2-无效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，1-有效，2-无效
     *
     * @param status 状态，1-有效，2-无效
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取1-一级合伙人 2-二级合伙人 3-商家
     *
     * @return TYPE - 1-一级合伙人 2-二级合伙人 3-商家
     */
    public String getType() {
        return type;
    }

    /**
     * 设置1-一级合伙人 2-二级合伙人 3-商家
     *
     * @param type 1-一级合伙人 2-二级合伙人 3-商家
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取代理手机
     *
     * @return PHONE - 代理手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置代理手机
     *
     * @param phone 代理手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取分成比例
     *
     * @return PROPORTION - 分成比例
     */
    public String getProportion() {
        return proportion;
    }

    /**
     * 设置分成比例
     *
     * @param proportion 分成比例
     */
    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    /**
     * 获取真实姓名
     *
     * @return NAME - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否删除，0-正常，1-删除
     *
     * @return IS_DELETE - 是否删除，0-正常，1-删除
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除，0-正常，1-删除
     *
     * @param isDelete 是否删除，0-正常，1-删除
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取用户ID
     *
     * @return USER_ID - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取成为代理时间
     *
     * @return UPGRADE_AGENT_TIME - 成为代理时间
     */
    public Date getUpgradeAgentTime() {
        return upgradeAgentTime;
    }

    /**
     * 设置成为代理时间
     *
     * @param upgradeAgentTime 成为代理时间
     */
    public void setUpgradeAgentTime(Date upgradeAgentTime) {
        this.upgradeAgentTime = upgradeAgentTime;
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
}