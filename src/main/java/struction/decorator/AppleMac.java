package main.java.struction.decorator;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:9:44
 */
public class AppleMac extends AOrders{
    @Override
    protected String getDesc() {
        return "MacBook Pro M3 14寸 18G+1T x 1   16999元";
    }

    @Override
    protected int getCost() {
        return 16999;
    }
}
