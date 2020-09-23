package com.example.securityResourcDemo1.Service;

import com.example.securityResourcDemo1.Repositery.OrderdetailsRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {
    //getAllOrderDetails
    //getOrderDetails
    //addOrderDetails
    //updateOrderDetails
    //deleteOrderDetails
    @Autowired
    private OrderdetailsRepositery  orderdetailsRepositery;

//    private List<OrderdetailsDao> getAllOrderDetails(){
//        List<Orderdetails> orderdetailsList=this.orderdetailsRepositery.findAll();
//
//        for(Orderdetails orderdetails : orderdetailsList){
//            Item item=orderdetails.getItem();
//            ItemDao itemDao=new ItemDao(item.getId(),item.getName(),item.getQty());
//            Order order=orderdetails.getOrder();
//
//            OrderDao orderDao=new OrderDao(order.getId(),);
//            OrderdetailsDao orderdetailsDao=new OrderdetailsDao();
//
//        }
//    }

}
