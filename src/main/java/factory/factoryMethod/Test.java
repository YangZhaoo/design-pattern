package main.java.factory.factoryMethod;

import java.util.Collection;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:15:44
 *
 * 工厂方法模式，将对象的创建推迟到子类中，不同的子类会创建不同的对象。
 * {@link Collection#iterator()}
 * {@link java.net.URLStreamHandlerFactory}
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        video = pythonVideoFactory.getVideo();
        video.produce();
    }
}
