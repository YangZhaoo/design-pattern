package main.java.creation.factory.abstraceFactory;

import main.java.creation.factory.abstraceFactory.apple.AppleFactory;
import main.java.creation.factory.abstraceFactory.huawei.HuaWeiFactory;
import main.java.creation.factory.abstraceFactory.xiaomi.XiaoMiFactory;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:17:21
 *
 * 抽象工厂，一个工厂生产统一族的产品。
 * {@link java.sql.Connection}
 */
public class Test {
    public static void main(String[] args) {
        ElectronicProductFactory xiaomiFactory = new XiaoMiFactory();
        Pad pad = xiaomiFactory.getPad();
        pad.watchVideo();

        ElectronicProductFactory huaweiFactory = new HuaWeiFactory();
        PC pc = huaweiFactory.getPersonalComputer();
        pc.coding();

        ElectronicProductFactory appleFactory = new AppleFactory();
        Phone phone = appleFactory.getPhone();
        phone.call();
    }
}
