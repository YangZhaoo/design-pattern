package main.java.singleton;

import main.java.singleton.bean.EnumInstance;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:11:49
 */
public class EnumTest {

    // 反序列化攻击测试
    public static void serializableTest() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./tmp/enum_instance"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./tmp/enum_instance"));
        EnumInstance instance1 = (EnumInstance) ois.readObject();

        System.out.println(instance == instance1);
        System.out.println(instance.getData());
        System.out.println(instance1.getData());
        System.out.println(instance.getData() == instance1.getData());
    }

    // 反射攻击测试
    public static void reflectTest() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        EnumInstance instance = EnumInstance.getInstance();

        Class<EnumInstance> enumInstanceClass = EnumInstance.class;
        Constructor<EnumInstance> declaredConstructor = enumInstanceClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumInstance instance1 = declaredConstructor.newInstance("yz", 123);

        System.out.println(instance == instance1);
    }
    public static void main(String[] args) throws Exception {
//        reflectTest();
        EnumInstanceV2 instance = EnumInstanceV2.getInstance();
        instance.printTest();
    }
}
