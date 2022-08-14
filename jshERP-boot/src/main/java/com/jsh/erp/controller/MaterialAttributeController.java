package com.jsh.erp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.jsh.erp.service.materialAttribute.MaterialAttributeService;
import com.jsh.erp.utils.BaseResponseInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author palan erp
 */
@RestController
@RequestMapping(value = "/materialAttribute")
@Api(tags = {"商品属性"})
public class MaterialAttributeController {
    private Logger logger = LoggerFactory.getLogger(MaterialAttributeController.class);

    @Resource
    private MaterialAttributeService materialAttributeService;

    /**
     * 获取全部商品属性
     * @param request
     * @return
     * @throws Exception
     */
    @GetMapping("/getAll")
    @ApiOperation(value = "获取全部商品属性")
    public BaseResponseInfo getAll(HttpServletRequest request)throws Exception {
        BaseResponseInfo res = new BaseResponseInfo();
        try {
            JSONObject obj = materialAttributeService.getAll();
            res.code = 200;
            res.data = obj;
        } catch(Exception e){
            logger.error(e.getMessage(), e);
            res.code = 500;
            res.data = "获取数据失败";
        }
        return res;
    }
}
