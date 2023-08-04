package com.yiren.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yiren.entity.Routel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yiren.exception.GlobalExceptionHandler;
import com.yiren.exception.GlobalExceptionMyHandler;
import com.yiren.qo.RouteQuery;
import com.yiren.vo.AnalysisVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzw
 * @since 2023-01-20
 */
public interface RoutelService extends IService<Routel> {

    Integer count0() ;

    Integer count1() ;

    Boolean saveOrUpdateRoutel(Routel routel) throws GlobalExceptionHandler;

    Routel findRoutelById(Long id) throws GlobalExceptionMyHandler;

    Boolean deleteById(Long id) throws GlobalExceptionHandler;

    Boolean updateStates(Routel routel) throws GlobalExceptionHandler;

    List<AnalysisVO> stateAll() throws GlobalExceptionHandler;

    Page<Routel> listPage(RouteQuery query) throws GlobalExceptionHandler;
}
