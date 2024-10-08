package com.entity.view;

import com.entity.DianyingCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 电影收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dianying_collection")
public class DianyingCollectionView extends DianyingCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String dianyingCollectionValue;



		//级联表 dianying
			/**
			* 电影名称
			*/
			private String dianyingName;
			/**
			* 电影照片
			*/
			private String dianyingPhoto;
			/**
			* 电影类型
			*/
			private Integer dianyingTypes;
				/**
				* 电影类型的值
				*/
				private String dianyingValue;
			/**
			* 电影原价
			*/
			private Double dianyingOldMoney;
			/**
			* 现价
			*/
			private Double dianyingNewMoney;
			/**
			* 座位
			*/
			private Integer zuoweiNumber;
			/**
			* 电影热度
			*/
			private Integer dianyingClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer dianyingDelete;
			/**
			* 电影简介
			*/
			private String dianyingContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public DianyingCollectionView() {

	}

	public DianyingCollectionView(DianyingCollectionEntity dianyingCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, dianyingCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getDianyingCollectionValue() {
				return dianyingCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setDianyingCollectionValue(String dianyingCollectionValue) {
				this.dianyingCollectionValue = dianyingCollectionValue;
			}




				//级联表的get和set dianying

					/**
					* 获取： 电影名称
					*/
					public String getDianyingName() {
						return dianyingName;
					}
					/**
					* 设置： 电影名称
					*/
					public void setDianyingName(String dianyingName) {
						this.dianyingName = dianyingName;
					}

					/**
					* 获取： 电影照片
					*/
					public String getDianyingPhoto() {
						return dianyingPhoto;
					}
					/**
					* 设置： 电影照片
					*/
					public void setDianyingPhoto(String dianyingPhoto) {
						this.dianyingPhoto = dianyingPhoto;
					}

					/**
					* 获取： 电影类型
					*/
					public Integer getDianyingTypes() {
						return dianyingTypes;
					}
					/**
					* 设置： 电影类型
					*/
					public void setDianyingTypes(Integer dianyingTypes) {
						this.dianyingTypes = dianyingTypes;
					}


						/**
						* 获取： 电影类型的值
						*/
						public String getDianyingValue() {
							return dianyingValue;
						}
						/**
						* 设置： 电影类型的值
						*/
						public void setDianyingValue(String dianyingValue) {
							this.dianyingValue = dianyingValue;
						}

					/**
					* 获取： 电影原价
					*/
					public Double getDianyingOldMoney() {
						return dianyingOldMoney;
					}
					/**
					* 设置： 电影原价
					*/
					public void setDianyingOldMoney(Double dianyingOldMoney) {
						this.dianyingOldMoney = dianyingOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getDianyingNewMoney() {
						return dianyingNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setDianyingNewMoney(Double dianyingNewMoney) {
						this.dianyingNewMoney = dianyingNewMoney;
					}

					/**
					* 获取： 座位
					*/
					public Integer getZuoweiNumber() {
						return zuoweiNumber;
					}
					/**
					* 设置： 座位
					*/
					public void setZuoweiNumber(Integer zuoweiNumber) {
						this.zuoweiNumber = zuoweiNumber;
					}

					/**
					* 获取： 电影热度
					*/
					public Integer getDianyingClicknum() {
						return dianyingClicknum;
					}
					/**
					* 设置： 电影热度
					*/
					public void setDianyingClicknum(Integer dianyingClicknum) {
						this.dianyingClicknum = dianyingClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getDianyingDelete() {
						return dianyingDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setDianyingDelete(Integer dianyingDelete) {
						this.dianyingDelete = dianyingDelete;
					}

					/**
					* 获取： 电影简介
					*/
					public String getDianyingContent() {
						return dianyingContent;
					}
					/**
					* 设置： 电影简介
					*/
					public void setDianyingContent(String dianyingContent) {
						this.dianyingContent = dianyingContent;
					}



















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
