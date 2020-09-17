package com.zhongguo.mail.product.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongguo.mail.product.entity.BrandEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandServiceTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoad(){
        BrandEntity brandEntity= new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        for(BrandEntity brand : list){
            System.out.print(brand);
        }

    }


}