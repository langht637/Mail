package com.zhongguo.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:07:08
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

