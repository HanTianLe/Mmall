package com.htl.service;

import com.htl.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrdersServiceTest {

    @Autowired
    private OrdersService service;

    @Test
    void test(){
        Orders orders = new Orders();
        orders.setUserId(1);
        orders.setLoginName("1");
        orders.setUserAddress("qwer");
        orders.setCost(100.0f);
        service.save(orders);
    }

}
