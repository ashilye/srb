package com.atguigu.srb.core.controller.admin;


import com.atguigu.srb.core.service.IntegralGradeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * admin 积分等级表 前端控制器
 * </p>
 *
 * @author gaoguanqi
 * @since 2021-04-22
 */
@CrossOrigin  //跨域
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;


}

