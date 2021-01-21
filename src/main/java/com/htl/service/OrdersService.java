package com.htl.service;

import com.htl.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;
import com.htl.entity.User;
import com.htl.vo.OrderVO;

import java.util.List;

/**
 *
 * @author 韩天乐
 * @since 2020-12-08
 */
public interface OrdersService extends IService<Orders> {
    public boolean save(Orders orders, User user, String address, String remark);
    public List<OrderVO> findAllOrederVOByUserId(Integer id);
}
