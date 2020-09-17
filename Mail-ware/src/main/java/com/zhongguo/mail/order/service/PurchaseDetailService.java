package com.zhongguo.mail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.order.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:14:43
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

