package main.java.struction.proxy;

public class OrderServiceImpl implements IOrderService {

    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        // 在本例中进行手动注入
        orderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return orderDao.insert(order );
    }
}
