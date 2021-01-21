package com.htl.service;

import com.htl.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.htl.vo.ProductCategoryVO;

import java.util.List;

/**
 *
 * @author 韩天乐
 * @since 2020-12-08
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    public List<ProductCategoryVO> getAllProductCategoryVO();
}
