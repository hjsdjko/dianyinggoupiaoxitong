package com.entity.vo;

import com.entity.DianyingChangciEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 电影场次
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dianying_changci")
public class DianyingChangciVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
