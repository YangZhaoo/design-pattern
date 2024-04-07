package main.java.struction.proxy.staticproxy;

import main.java.struction.proxy.IOrderService;
import main.java.struction.proxy.Order;
import main.java.struction.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy implements IOrderService{
    private IOrderService orderService;

    @Override
    public int saveOrder(Order order) {
        beforeMethod();
        orderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int routeId = userId % 2;
        System.out.println("静态代理分配到【db" + routeId + "】处理数据");
        int resCode = orderService.saveOrder(order);
        afterMethod();
        return resCode;
    }

    private void beforeMethod() {
        System.out.println("静态代理之前要执行的方法");
    }

    private void afterMethod() {
        System.out.println("静态代理之后要执行的方法");
    }
}
