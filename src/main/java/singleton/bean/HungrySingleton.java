package main.java.singleton.bean;

import java.io.Serializable;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:10:29
 */
public class HungrySingleton implements Serializable {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        // 防止反射攻击
        if (hungrySingleton != null) {
            throw new RuntimeException("repeated create singleton is not access");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // 解决反序列化的攻击
    public Object readResolve() {
        return hungrySingleton;
    }
}
