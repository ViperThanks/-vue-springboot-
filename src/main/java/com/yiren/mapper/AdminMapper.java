package com.yiren.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yiren.entity.Admin;
import com.yiren.entity.Province;
import com.yiren.vo.ProvinceVo;

import java.util.List;

public interface AdminMapper extends BaseMapper<Admin> {

    public List<ProvinceVo> findProvinceByid();

    public List<Province> findfindProvinceAll();


}
