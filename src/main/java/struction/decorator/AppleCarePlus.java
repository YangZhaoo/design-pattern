package main.java.struction.decorator;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:9:49
 */
public class AppleCarePlus extends ADecorator {

    public AppleCarePlus(AOrders orders) {
        super(orders);
    }

    @Override
    protected String getDesc() {
        String curDesc = super.getDesc();
        return curDesc + "\n" + "AppleCare+ x 1   799元";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 799;
    }
}
