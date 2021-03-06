package com.zhongguo.mail.order.dao;

import com.zhongguo.mail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:10:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
