package com.htl.service;

import com.htl.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.htl.vo.TableDataVO;
import com.htl.vo.TableProductVO;

import java.util.List;

/**
 *
 * @author 韩天乐
 * @since 2020-12-08
 */
public interface ProductService extends IService<Product> {
    public List<Product> findByCategoryId(String type,Integer categoryId);
    /**
     * 后台管理系统返回商品数据
     */
    public TableDataVO<TableProductVO> findAllTableData(Integer page, Integer limit);
}
