package main.java.behavioral.strategy.strategys.impl;

import main.java.behavioral.strategy.strategys.PromotionStrategy;

public class ManjianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满200减20");
    }
}
