package com.mysql.mappers.cdbmapper.beans;



import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cabinet_info")
public class CabinetInfo {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 柜机序列号
     */
    @Column(name = "CABINET_NO")
    private String cabinetNo;

    /**
     * 柜机二维码
     */
    @Column(name = "CABINET_QRCODE")
    private String cabinetQrcode;

    /**
     * 绑定状态 0-未绑定1-已绑定
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 使用状态 0-在线1-离线
     */
    @Column(name = "USE_STATUS")
    private String useStatus;

    /**
     * 可借数量
     */
    @Column(name = "AVAILABLE_COUNT")
    private Integer availableCount;

    /**
     * 总数量
     */
    @Column(name = "POWER_COUNT")
    private Integer powerCount;

    /**
     * 使用人编号
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 平台编号
     */
    @Column(name = "PLATFORM_ID")
    private String platformId;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
//    @Temporal(TemporalType.TIMESTAMP)
//    @JSONField(format=" yyyy-MM-dd")  //FastJson包使用注解
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") //Jackson包使用注解
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")   //格式化前台日期参数注解
    private Date createdTime;

    @Transient
    private String createTimestr;

    public String getCreateTimestr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(getCreatedTime());
    }

    public void setCreateTimestr(Date createTimestr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.createTimestr = sdf.format(createTimestr);
    }

    /**
     * 更新人
     */
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @Column(name = "UPDATED_TIME")
    private Date updatedTime;

    @Column(name = "BUSINESS_ID")
    private String businessId;

    /**
     * 每小时租金
     */
    @Column(name = "RENT_HOURS")
    private BigDecimal rentHours;

    /**
     * 封顶租金
     */
    @Column(name = "MAX_RENT")
    private BigDecimal maxRent;

    /**
     * 获取编号
     *
     * @return ID - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取柜机序列号
     *
     * @return CABINET_NO - 柜机序列号
     */
    public String getCabinetNo() {
        return cabinetNo;
    }

    /**
     * 设置柜机序列号
     *
     * @param cabinetNo 柜机序列号
     */
    public void setCabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo;
    }

    /**
     * 获取柜机二维码
     *
     * @return CABINET_QRCODE - 柜机二维码
     */
    public String getCabinetQrcode() {
        return cabinetQrcode;
    }

    /**
     * 设置柜机二维码
     *
     * @param cabinetQrcode 柜机二维码
     */
    public void setCabinetQrcode(String cabinetQrcode) {
        this.cabinetQrcode = cabinetQrcode;
    }

    /**
     * 获取绑定状态 0-未绑定1-已绑定
     *
     * @return STATUS - 绑定状态 0-未绑定1-已绑定
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置绑定状态 0-未绑定1-已绑定
     *
     * @param status 绑定状态 0-未绑定1-已绑定
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取使用状态 0-在线1-离线
     *
     * @return USE_STATUS - 使用状态 0-在线1-离线
     */
    public String getUseStatus() {
        return useStatus;
    }

    /**
     * 设置使用状态 0-在线1-离线
     *
     * @param useStatus 使用状态 0-在线1-离线
     */
    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    /**
     * 获取可借数量
     *
     * @return AVAILABLE_COUNT - 可借数量
     */
    public Integer getAvailableCount() {
        return availableCount;
    }

    /**
     * 设置可借数量
     *
     * @param availableCount 可借数量
     */
    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    /**
     * 获取总数量
     *
     * @return POWER_COUNT - 总数量
     */
    public Integer getPowerCount() {
        return powerCount;
    }

    /**
     * 设置总数量
     *
     * @param powerCount 总数量
     */
    public void setPowerCount(Integer powerCount) {
        this.powerCount = powerCount;
    }

    /**
     * 获取使用人编号
     *
     * @return USER_ID - 使用人编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置使用人编号
     *
     * @param userId 使用人编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * 获取更新人
     *
     * @return UPDATED_BY - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATED_TIME - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * @return BUSINESS_ID
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * @param businessId
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取每小时租金
     *
     * @return RENT_HOURS - 每小时租金
     */
    public BigDecimal getRentHours() {
        return rentHours;
    }

    /**
     * 设置每小时租金
     *
     * @param rentHours 每小时租金
     */
    public void setRentHours(BigDecimal rentHours) {
        this.rentHours = rentHours;
    }

    /**
     * 获取封顶租金
     *
     * @return MAX_RENT - 封顶租金
     */
    public BigDecimal getMaxRent() {
        return maxRent;
    }

    /**
     * 设置封顶租金
     *
     * @param maxRent 封顶租金
     */
    public void setMaxRent(BigDecimal maxRent) {
        this.maxRent = maxRent;
    }


}