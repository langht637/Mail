package com.zhongguo.mail.order.dao;

import com.zhongguo.mail.order.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:14:43
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
