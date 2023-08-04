package com.yiren.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yiren.entity.Menu;
import com.yiren.vo.MenuListVo;

/**
 * @author xiaohuang
 * @date 2023/6/26
 */
public interface MenuService extends IService<Menu> {
    MenuListVo selectList(Long roleId) throws Exception;

}
