package main.java.struction.composite;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:14:19
 */
public abstract class Image {

    public void add(Image image) {
        throw new RuntimeException("不支持添加操作");
    }

    public void remove(int index) {
        throw new RuntimeException("不支持添加操作");
    }

    public void printName(int deepth) {
        throw new RuntimeException("不支持添加操作");
    }

    public int getSize() {
        throw new RuntimeException("不支持添加操作");
    }

    public int getCount() {
        throw new RuntimeException("不支持添加操作");
    }
}
