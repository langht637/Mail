package com.zhongguo.mail.coupon.dao;

import com.zhongguo.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 14:49:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
