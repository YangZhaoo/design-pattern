package main.java.creation.factory.factoryMethod;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:16:27
 */
public class PythonVideoFactory implements VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
