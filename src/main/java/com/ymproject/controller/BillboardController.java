package com.ymproject.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.ymproject.common.api.ApiResult;
import com.ymproject.model.entity.BillBoard;
import com.ymproject.service.BillboardService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/billboard")
@CrossOrigin()
public class BillboardController extends BaseController{
    @Resource
    private BillboardService billboardService;

    @GetMapping("/show")
    public ApiResult<BillBoard> getNotices(){
        List<BillBoard> list = billboardService.list(new LambdaQueryWrapper<BillBoard>().eq(BillBoard::isShow,true));//查询
        return ApiResult.success(list.get(list.size()-1));
    }
}
