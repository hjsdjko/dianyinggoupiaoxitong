package com.dao;

import com.entity.DianyingChangciEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingChangciView;

/**
 * 电影场次 Dao 接口
 *
 * @author 
 */
public interface DianyingChangciDao extends BaseMapper<DianyingChangciEntity> {

   List<DianyingChangciView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
