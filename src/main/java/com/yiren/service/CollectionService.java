package com.yiren.service;

import com.yiren.comon.ResponseResult;
import com.yiren.entity.Collection;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yiren.qo.CollectQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzw
 * @since 2023-01-26
 */
public interface CollectionService extends IService<Collection> {

    ResponseResult saveCollection(Collection collection);

    ResponseResult findCollectionByPage(CollectQuery query);

    ResponseResult isCollection(Long productId,Long productType);
}
