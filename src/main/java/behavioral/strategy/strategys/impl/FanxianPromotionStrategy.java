package main.java.behavioral.strategy.strategys.impl;

import main.java.behavioral.strategy.strategys.PromotionStrategy;

public class FanxianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("一单返现20元");
    }
}
