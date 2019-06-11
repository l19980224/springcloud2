package com.mysql.mappers.cdbmapper.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Table(name = "power_bank_info")
public class PowerBankInfo {
    /**
     * id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 充电宝序列号
     */
    @Column(name = "POWER_BANK_NO")
    private String powerBankNo;

    /**
     * 状态，0-可用，1-不可用
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创建人
     */
    @Column(name = "CREATER_ID")
    private String createrId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;


    @Transient
    private String createTimestr;

    public String getCreateTimestr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        if (getCreateTime()!=null){
            return sdf.format(getCreateTime());
        }
        return createTimestr;
    }

    public void setCreateTimestr(Date createTimestr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        this.createTimestr = sdf.format(createTimestr);
    }

    /**
     * 获取id
     *
     * @return ID - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取充电宝序列号
     *
     * @return POWER_BANK_NO - 充电宝序列号
     */
    public String getPowerBankNo() {
        return powerBankNo;
    }

    /**
     * 设置充电宝序列号
     *
     * @param powerBankNo 充电宝序列号
     */
    public void setPowerBankNo(String powerBankNo) {
        this.powerBankNo = powerBankNo;
    }

    /**
     * 获取状态，0-可用，1-不可用
     *
     * @return STATUS - 状态，0-可用，1-不可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，0-可用，1-不可用
     *
     * @param status 状态，0-可用，1-不可用
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}