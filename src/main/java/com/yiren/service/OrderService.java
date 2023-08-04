package com.yiren.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yiren.entity.Order;
import com.yiren.DTO.OrderDTO;
import com.yiren.exception.GlobalExceptionHandler;
import com.yiren.exception.GlobalExceptionMyHandler;
import com.yiren.qo.OrderQuery;
import com.yiren.qo.UserOrderQuery;
import com.yiren.vo.AnalysisVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzw
 * @since 2023-01-21
 */
public interface OrderService extends IService<Order> {

    Integer count0() throws GlobalExceptionHandler;

    Integer count1() throws GlobalExceptionHandler;

    Boolean updateOrder(Order order) throws GlobalExceptionMyHandler;

    Order findOrderById(Long id) throws GlobalExceptionMyHandler;

    Boolean deleteById(Long id) throws GlobalExceptionHandler;

    Boolean updateStates(Order order) throws GlobalExceptionHandler;

    List<AnalysisVO> typeAll() throws GlobalExceptionHandler;

    List<AnalysisVO> stateAll() throws GlobalExceptionHandler;

    List<Order> findAll() throws GlobalExceptionHandler;

    IPage<Order> listPage(OrderQuery query) throws GlobalExceptionHandler;

    Long userOrder(OrderDTO orderDto) throws GlobalExceptionHandler;

    Boolean toBePaid(Order order) throws GlobalExceptionMyHandler;


    IPage<Order> orderListPage(UserOrderQuery query) throws GlobalExceptionHandler;

    Boolean callOff(Order order) throws GlobalExceptionHandler;

    Boolean refunded(Order order) throws GlobalExceptionHandler;

    Boolean deleteByUser(Long id) throws GlobalExceptionHandler;
}
