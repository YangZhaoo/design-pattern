package main.java.behavioral.strategy;

import main.java.behavioral.strategy.strategys.PromotionStrategy;
import main.java.behavioral.strategy.strategys.impl.FanxianPromotionStrategy;
import main.java.behavioral.strategy.strategys.impl.LiJianPromotionStrategy;


/**
 * JDK中的策略模式
 * {@link java.util.Comparator}
 * {@link java.util.concurrent.RejectedExecutionHandler}
 */
public class Test {

    public static void test1() {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        promotionActivity618.executePromotionStrategy();

        PromotionActivity promotionActivity11 = new PromotionActivity(new FanxianPromotionStrategy());
        promotionActivity11.executePromotionStrategy();
    }

    public static void test2(String strategy) {
        PromotionStrategy promotionStrategy = PromotionFactory.getPromotionStrategy(strategy);
        PromotionActivity promotionActivity = new PromotionActivity(promotionStrategy);
        promotionActivity.executePromotionStrategy();
    }

    public static void main(String[] args) {
        test2("fanxian");
    }
}
