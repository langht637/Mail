package com.zhongguo.mail.product.dao;

import com.zhongguo.mail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 11:46:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
