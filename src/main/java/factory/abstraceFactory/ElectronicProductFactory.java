package main.java.factory.abstraceFactory;


/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:17:03
 */
public interface ElectronicProductFactory {
    Phone getPhone();

    Pad getPad();

    PC getPersonalComputer();
}
