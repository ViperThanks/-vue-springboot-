package com.yiren.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yiren.exception.GlobalExceptionHandler;
import com.yiren.exception.GlobalExceptionMyHandler;
import com.yiren.vo.AnalysisVO;
import com.yiren.vo.SpotVo;
import com.yiren.entity.ScenicSpot;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yiren.qo.ScenciSpotQuery;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzw
 * @since 2023-01-20
 */
public interface ScenicSpotService extends IService<ScenicSpot> {

    Integer count0();

    Integer count1();

    Boolean saveOrUpdateScenicSpot(ScenicSpot scenicSpot) throws GlobalExceptionHandler;

    ScenicSpot findScenicSpotById(Long id) throws GlobalExceptionMyHandler;

    Boolean deleteById(Long id) throws GlobalExceptionHandler;

    Boolean updateStates(ScenicSpot scenicSpot) throws GlobalExceptionHandler;

    List<AnalysisVO> stateAll() throws GlobalExceptionHandler;

    List<ScenicSpot> findAll() throws GlobalExceptionHandler;

    IPage<ScenicSpot> listPage(ScenciSpotQuery query) throws GlobalExceptionHandler;

    List<SpotVo> getSpotHotel() throws GlobalExceptionHandler;
}
