package main.java.factory.factoryMethod;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:16:25
 */
public class JavaVideoFactory implements VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
