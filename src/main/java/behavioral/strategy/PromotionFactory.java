package main.java.behavioral.strategy;

import main.java.behavioral.strategy.strategys.impl.FanxianPromotionStrategy;
import main.java.behavioral.strategy.strategys.impl.LiJianPromotionStrategy;
import main.java.behavioral.strategy.strategys.impl.ManjianPromotionStrategy;
import main.java.behavioral.strategy.strategys.PromotionStrategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {

    private static final PromotionStrategy DEFAULT_STRATEGY = new LiJianPromotionStrategy();

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap() {
        {
            put("LIJAIN", new LiJianPromotionStrategy());
            put("MANJIAN", new ManjianPromotionStrategy());
            put("FANXIAN", new FanxianPromotionStrategy());
        }
    };

    private PromotionFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        return PROMOTION_STRATEGY_MAP.getOrDefault(promotionKey, DEFAULT_STRATEGY);
    }
}
