package com.zhongguo.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 14:49:47
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

