package main.java.behavioral.strategy.strategys.impl;

import main.java.behavioral.strategy.strategys.PromotionStrategy;

public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("一单立减20元");
    }
}
