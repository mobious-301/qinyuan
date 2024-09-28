package com.example.demo.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.SaleChanceDao;
import com.example.demo.pojo.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleChanceService {
     //对对应的实体类成员变量、方法以及构造两
    //数进行标注，自动完成装配工作
    //调用dao层，先引入dao层
    @Autowired
    SaleChanceDao saleChanceDao;
    public List<SaleChance> getSaleList(){
        List<SaleChance> SaleChanceList= saleChanceDao.selectList(null);

        return SaleChanceList;
    }



    //分页查询数据
// no usages
    public IPage<SaleChance> getSalePageData(Integer currentPage , Integer limitNum){
    // 创建page.对象
    Page<SaleChance> salePage = new Page<>(currentPage , limitNum) ; 
    //调用dao层，执行查询(所有数据)工作
    saleChanceDao.selectPage(salePage, null) ; 
    return salePage;
    }

}
