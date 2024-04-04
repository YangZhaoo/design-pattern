package main.java.singleton;

import main.java.singleton.bean.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:11:05
 */
public class BreakByReflect {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        HungrySingleton instance = HungrySingleton.getInstance();

        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> declaredConstructor = hungrySingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instanceByReflect = declaredConstructor.newInstance();

        System.out.println(instance == instanceByReflect);
    }
}
