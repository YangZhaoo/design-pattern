package main.java.creation.singleton;

import main.java.creation.singleton.bean.LazySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:15:28
 */
public class CloneTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        LazySingleton instance = LazySingleton.getInstance();
        Method clone = instance.getClass().getDeclaredMethod("clone");
        clone.setAccessible(true);
        LazySingleton cloneInstance = (LazySingleton) clone.invoke(instance);
        System.out.println(instance);
        System.out.println(cloneInstance);
    }
}
