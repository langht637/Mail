package com.zhongguo.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 11:46:51
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

