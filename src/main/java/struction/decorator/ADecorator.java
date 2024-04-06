package main.java.struction.decorator;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:9:46
 */
public class ADecorator extends AOrders {
    private AOrders orders;

    public ADecorator(AOrders orders) {
        this.orders = orders;
    }

    @Override
    protected String getDesc() {
        return orders.getDesc();
    }

    @Override
    protected int getCost() {
        return orders.getCost();
    }
}
