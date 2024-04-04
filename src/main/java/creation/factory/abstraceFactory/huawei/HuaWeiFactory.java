package main.java.creation.factory.abstraceFactory.huawei;

import main.java.creation.factory.abstraceFactory.ElectronicProductFactory;
import main.java.creation.factory.abstraceFactory.PC;
import main.java.creation.factory.abstraceFactory.Pad;
import main.java.creation.factory.abstraceFactory.Phone;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:17:19
 */
public class HuaWeiFactory implements ElectronicProductFactory {
    @Override
    public Phone getPhone() {
        return new Magic5Pro();
    }

    @Override
    public Pad getPad() {
        return new MagicPad();
    }

    @Override
    public PC getPersonalComputer() {
        return new MagicPC();
    }
}
