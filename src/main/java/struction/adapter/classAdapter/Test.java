package main.java.struction.adapter.classAdapter;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:12:13
 */
public class Test {
    public static void main(String[] args) {
        VGADisplay samsung = new Samsung();
        samsung.display();

        VGADisplay adapter = new Adapter();
        adapter.display();
    }
}
