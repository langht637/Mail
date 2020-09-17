package com.zhongguo.mail.order.dao;

import com.zhongguo.mail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:10:44
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
