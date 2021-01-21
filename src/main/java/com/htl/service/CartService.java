package com.htl.service;

import com.htl.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.htl.vo.CartVO;

import java.util.List;

/**
 *
 * @author 韩天乐
 * @since 2020-12-08
 */
public interface CartService extends IService<Cart> {
    public List<CartVO> findAllCartVOByUserId(Integer id);
}
