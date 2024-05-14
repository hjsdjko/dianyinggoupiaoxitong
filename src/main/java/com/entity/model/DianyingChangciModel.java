package com.entity.model;

import com.entity.DianyingChangciEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电影场次
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DianyingChangciModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 电影
     */
    private Integer dianyingId;


    /**
     * 影院名称
     */
    private String dianyingChangciYingyuanName;


    /**
     * 放映厅
     */
    private String dianyingChangciYingyuanFangyingting;


    /**
     * 放映地点
     */
    private String dianyingChangciYingyuanAddress;


    /**
     * 放映开始时间
     */
    private String fangyingKaishiShijian;


    /**
     * 放映结束时间
     */
    private String fangyingJieshuShijian;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：电影
	 */
    public Integer getDianyingId() {
        return dianyingId;
    }


    /**
	 * 设置：电影
	 */
    public void setDianyingId(Integer dianyingId) {
        this.dianyingId = dianyingId;
    }
    /**
	 * 获取：影院名称
	 */
    public String getDianyingChangciYingyuanName() {
        return dianyingChangciYingyuanName;
    }


    /**
	 * 设置：影院名称
	 */
    public void setDianyingChangciYingyuanName(String dianyingChangciYingyuanName) {
        this.dianyingChangciYingyuanName = dianyingChangciYingyuanName;
    }
    /**
	 * 获取：放映厅
	 */
    public String getDianyingChangciYingyuanFangyingting() {
        return dianyingChangciYingyuanFangyingting;
    }


    /**
	 * 设置：放映厅
	 */
    public void setDianyingChangciYingyuanFangyingting(String dianyingChangciYingyuanFangyingting) {
        this.dianyingChangciYingyuanFangyingting = dianyingChangciYingyuanFangyingting;
    }
    /**
	 * 获取：放映地点
	 */
    public String getDianyingChangciYingyuanAddress() {
        return dianyingChangciYingyuanAddress;
    }


    /**
	 * 设置：放映地点
	 */
    public void setDianyingChangciYingyuanAddress(String dianyingChangciYingyuanAddress) {
        this.dianyingChangciYingyuanAddress = dianyingChangciYingyuanAddress;
    }
    /**
	 * 获取：放映开始时间
	 */
    public String getFangyingKaishiShijian() {
        return fangyingKaishiShijian;
    }


    /**
	 * 设置：放映开始时间
	 */
    public void setFangyingKaishiShijian(String fangyingKaishiShijian) {
        this.fangyingKaishiShijian = fangyingKaishiShijian;
    }
    /**
	 * 获取：放映结束时间
	 */
    public String getFangyingJieshuShijian() {
        return fangyingJieshuShijian;
    }


    /**
	 * 设置：放映结束时间
	 */
    public void setFangyingJieshuShijian(String fangyingJieshuShijian) {
        this.fangyingJieshuShijian = fangyingJieshuShijian;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
