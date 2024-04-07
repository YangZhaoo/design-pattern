package main.java.struction.proxy.dynamicproxy;

import main.java.struction.proxy.IOrderService;
import main.java.struction.proxy.Order;
import main.java.struction.proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService proxyObj = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        proxyObj.saveOrder(order);
    }
}
