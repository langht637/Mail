package com.zhongguo.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 11:46:50
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

