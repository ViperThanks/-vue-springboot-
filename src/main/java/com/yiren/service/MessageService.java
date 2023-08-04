package com.yiren.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yiren.entity.Message;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yiren.exception.GlobalExceptionHandler;
import com.yiren.exception.GlobalExceptionMyHandler;
import com.yiren.qo.MessageQuery;
import com.yiren.vo.MessageVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzw
 * @since 2023-01-20
 */
public interface MessageService extends IService<Message> {

    ArrayList<MessageVo> getMessage() throws GlobalExceptionHandler;
    ArrayList<MessageVo> getMessageUser(Long id) throws GlobalExceptionHandler;

    Boolean addMessage(Message message) throws GlobalExceptionHandler;

    Message findMessageById(Long id) throws GlobalExceptionMyHandler;

    Boolean deleteById(Message message) throws GlobalExceptionHandler;


    List<Map<String, Object>> stateAll() throws GlobalExceptionHandler;

    IPage<Message> listPage(MessageQuery query) throws GlobalExceptionHandler;

    Boolean reply(Message message) throws GlobalExceptionHandler;


    IPage<Message> listMessage(MessageQuery query) throws GlobalExceptionHandler;

    Integer stateReply() throws GlobalExceptionHandler;

    List<Message> listReply(Long id) throws GlobalExceptionHandler;
}
