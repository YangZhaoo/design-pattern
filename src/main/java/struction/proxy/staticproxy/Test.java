package main.java.struction.proxy.staticproxy;

import main.java.struction.proxy.IOrderService;
import main.java.struction.proxy.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService proxyService = new OrderServiceStaticProxy();
        proxyService.saveOrder(order);
    }
}
