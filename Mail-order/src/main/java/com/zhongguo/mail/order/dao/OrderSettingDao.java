package com.zhongguo.mail.order.dao;

import com.zhongguo.mail.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:10:44
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
