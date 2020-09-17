package com.zhongguo.mail.member.dao;

import com.zhongguo.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author langhongtian
 * @email 670493246@qq.com
 * @date 2020-09-17 15:07:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
