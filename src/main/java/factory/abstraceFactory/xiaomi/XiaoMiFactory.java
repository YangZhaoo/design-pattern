package main.java.factory.abstraceFactory.xiaomi;

import main.java.factory.abstraceFactory.ElectronicProductFactory;
import main.java.factory.abstraceFactory.PC;
import main.java.factory.abstraceFactory.Pad;
import main.java.factory.abstraceFactory.Phone;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:17:20
 */
public class XiaoMiFactory implements ElectronicProductFactory {
    @Override
    public Phone getPhone() {
        return new RedmiK70();
    }

    @Override
    public Pad getPad() {
        return new XiaomiPad();
    }

    @Override
    public PC getPersonalComputer() {
        return new XiaomiBook();
    }
}
