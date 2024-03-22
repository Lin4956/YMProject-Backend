package com.ymproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ymproject.mapper.BillboardMapper;
import com.ymproject.model.entity.BillBoard;
import com.ymproject.service.BillboardService;
import org.springframework.stereotype.Service;

@Service
public class BillboardServiceImpl extends ServiceImpl<BillboardMapper, BillBoard> implements BillboardService {

}
