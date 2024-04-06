package main.java.struction.decorator;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:9:51
 */
public class MacProtectiveCase extends ADecorator {
    public MacProtectiveCase(AOrders orders) {
        super(orders);
    }

    @Override
    protected String getDesc() {
        String curDesc = super.getDesc();;
        return curDesc + "\n" + "透明保护壳 x 1   199元";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 199;
    }
}
