package com.zhongguo.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 11:46:50
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asLists);
}

