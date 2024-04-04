package main.java.singleton.bean;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:9:35
 */
public class LazySingleton implements Cloneable {
    private static volatile LazySingleton lazySingleton = null;

    // 无法防止反射攻击，可以通过反射一直创建对象
    private LazySingleton() {}

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    public static LazySingleton getInstanceDCL() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 实现clone接口后，需要返回已创建好的实例对象。
        // 使用默认的实现会破坏单例模式
//        return super.clone();
        return lazySingleton;
    }
}
