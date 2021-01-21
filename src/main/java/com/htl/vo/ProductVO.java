package com.htl.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductVO {
    //主键
    private Integer id;
    //名称
    private String name;
    //价格
    private Float price;
    //文件名称
    private String fileName;
}

