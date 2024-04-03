package main.java.factory.abstraceFactory.apple;

import main.java.factory.abstraceFactory.ElectronicProductFactory;
import main.java.factory.abstraceFactory.PC;
import main.java.factory.abstraceFactory.Pad;
import main.java.factory.abstraceFactory.Phone;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:17:18
 */
public class AppleFactory implements ElectronicProductFactory {
    @Override
    public Phone getPhone() {
        return new IPhone15();
    }

    @Override
    public Pad getPad() {
        return new IPad();
    }

    @Override
    public PC getPersonalComputer() {
        return new MacBookPro();
    }
}
