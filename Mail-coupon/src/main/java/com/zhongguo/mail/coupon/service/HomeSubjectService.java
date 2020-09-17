package com.zhongguo.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 14:49:47
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

