package com.gsy.swagger.controller;

import com.gsy.swagger.mybatis.mapper.DepartmentMapper;
import com.gsy.swagger.mybatis.po.Department;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value="testController",tags ={"restful api示例"})
public class TestController {

    @Autowired
    DepartmentMapper dao;

    @GetMapping("/test")
    @ResponseBody
    @ApiOperation(value = "查询指定产品", httpMethod = "GET", produces = "application/json")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id", paramType = "query", dataType = "Integer")})
    public Department getDept(int id){
        Department department = dao.selectByPrimaryKey(id);
        return department;
    }
}
