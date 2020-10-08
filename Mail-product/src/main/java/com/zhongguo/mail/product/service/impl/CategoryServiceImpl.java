package com.zhongguo.mail.product.service.impl;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongguo.mail.common.utils.PageUtils;
import com.zhongguo.mail.common.utils.Query;

import com.zhongguo.mail.product.dao.CategoryDao;
import com.zhongguo.mail.product.entity.CategoryEntity;
import com.zhongguo.mail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> collect = entities.stream().filter((categoryEntity) ->{
            return categoryEntity.getParentCid()==0;
        }).map((categoryEntity) ->{
            categoryEntity.setChildren(getChilderns(categoryEntity,entities));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return menu1.getSort()-menu2.getSort();
        }).collect(Collectors.toList());
        return collect;
    }

    public List<CategoryEntity> getChilderns(CategoryEntity categoryEntity,List<CategoryEntity> entities) {
        List<CategoryEntity> list = entities.stream().filter((categoryEntity1) -> {
            return categoryEntity1.getParentCid().equals(categoryEntity.getCatId());
        }).map(categoryEntity1 -> {
            categoryEntity1.setChildren(getChilderns(categoryEntity1,entities));
            return categoryEntity1;
        }).sorted((me1,me2)->{
            return (me1.getSort()==null?0:me1.getSort())-(me2.getSort()==null?0:me2.getSort());
        }).collect(Collectors.toList());

        return list;
    }

    @Override
    public void removeMenuByIds(List<Long> asLists) {
        new String("12");
        baseMapper.deleteBatchIds(asLists);
    }

}