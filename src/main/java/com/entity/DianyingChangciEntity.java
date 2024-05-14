package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 电影场次
 *
 * @author 
 * @email
 */
@TableName("dianying_changci")
public class DianyingChangciEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianyingChangciEntity() {

	}

	public DianyingChangciEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 电影
     */
    @TableField(value = "dianying_id")

    private Integer dianyingId;


    /**
     * 影院名称
     */
    @TableField(value = "dianying_changci_yingyuan_name")

    private String dianyingChangciYingyuanName;


    /**
     * 放映厅
     */
    @TableField(value = "dianying_changci_yingyuan_fangyingting")

    private String dianyingChangciYingyuanFangyingting;


    /**
     * 放映地点
     */
    @TableField(value = "dianying_changci_yingyuan_address")

    private String dianyingChangciYingyuanAddress;


    /**
     * 放映开始时间
     */
    @TableField(value = "fangying_kaishi_shijian")

    private String fangyingKaishiShijian;


    /**
     * 放映结束时间
     */
    @TableField(value = "fangying_jieshu_shijian")

    private String fangyingJieshuShijian;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：电影
	 */
    public Integer getDianyingId() {
        return dianyingId;
    }
    /**
	 * 获取：电影
	 */

    public void setDianyingId(Integer dianyingId) {
        this.dianyingId = dianyingId;
    }
    /**
	 * 设置：影院名称
	 */
    public String getDianyingChangciYingyuanName() {
        return dianyingChangciYingyuanName;
    }
    /**
	 * 获取：影院名称
	 */

    public void setDianyingChangciYingyuanName(String dianyingChangciYingyuanName) {
        this.dianyingChangciYingyuanName = dianyingChangciYingyuanName;
    }
    /**
	 * 设置：放映厅
	 */
    public String getDianyingChangciYingyuanFangyingting() {
        return dianyingChangciYingyuanFangyingting;
    }
    /**
	 * 获取：放映厅
	 */

    public void setDianyingChangciYingyuanFangyingting(String dianyingChangciYingyuanFangyingting) {
        this.dianyingChangciYingyuanFangyingting = dianyingChangciYingyuanFangyingting;
    }
    /**
	 * 设置：放映地点
	 */
    public String getDianyingChangciYingyuanAddress() {
        return dianyingChangciYingyuanAddress;
    }
    /**
	 * 获取：放映地点
	 */

    public void setDianyingChangciYingyuanAddress(String dianyingChangciYingyuanAddress) {
        this.dianyingChangciYingyuanAddress = dianyingChangciYingyuanAddress;
    }
    /**
	 * 设置：放映开始时间
	 */
    public String getFangyingKaishiShijian() {
        return fangyingKaishiShijian;
    }
    /**
	 * 获取：放映开始时间
	 */

    public void setFangyingKaishiShijian(String fangyingKaishiShijian) {
        this.fangyingKaishiShijian = fangyingKaishiShijian;
    }
    /**
	 * 设置：放映结束时间
	 */
    public String getFangyingJieshuShijian() {
        return fangyingJieshuShijian;
    }
    /**
	 * 获取：放映结束时间
	 */

    public void setFangyingJieshuShijian(String fangyingJieshuShijian) {
        this.fangyingJieshuShijian = fangyingJieshuShijian;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DianyingChangci{" +
            "id=" + id +
            ", dianyingId=" + dianyingId +
            ", dianyingChangciYingyuanName=" + dianyingChangciYingyuanName +
            ", dianyingChangciYingyuanFangyingting=" + dianyingChangciYingyuanFangyingting +
            ", dianyingChangciYingyuanAddress=" + dianyingChangciYingyuanAddress +
            ", fangyingKaishiShijian=" + fangyingKaishiShijian +
            ", fangyingJieshuShijian=" + fangyingJieshuShijian +
            ", createTime=" + createTime +
        "}";
    }
}
