package com.example.demo.controller;

import com.example.demo.service.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import  com.example.demo.pojo.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zqm
 * @since 2024-09-26
 */
// @RestController //跨域
@CrossOrigin
@RestController
@RequestMapping("/saleChance")
public class SaleChanceController {
    @Autowired
    SaleChanceService saleChanceService;
    @RequestMapping("/saleList")
    public Map<String,Object> requestMethodName() {
        HashMap<String,Object> map=new HashMap<>();
        // return a;
        map.put("code", 0);
        map.put("msg", "成功查询");
        map.put("data",saleChanceService.getSaleList());
        return map;
    }

    @RequestMapping("/SalePageList")
    public Map<String,Object> requestMethodName(Integer currentPage,Integer limitNum) {
        IPage<SaleChance> SalePageData=saleChanceService.getSalePageData(currentPage, limitNum);
        HashMap<String,Object> map=new HashMap<>();
        map.put("code", 0);
        map.put("msg", "成功查询");
        map.put("data", SalePageData);
        map.put("specificData", SalePageData);
        
        return map;
    }


}

