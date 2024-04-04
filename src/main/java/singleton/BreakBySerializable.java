package main.java.singleton;

import main.java.singleton.bean.HungrySingleton;

import java.io.*;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:10:36
 */
public class BreakBySerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./tmp/singleton_object"));
        oos.writeObject(instance1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./tmp/singleton_object"));
        HungrySingleton instance2 = (HungrySingleton) ois.readObject();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
