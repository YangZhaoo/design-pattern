package main.java.struction.adapter.objectAdapter;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:12:13
 *
 * jdk 中的对象适配
 * {@link org.xml.sax.helpers.XMLReaderAdapter}
 */
public class Test {
    public static void main(String[] args) {
        VGADisplay samsung = new Samsung();
        samsung.display();

        VGADisplay adapter = new Adapter();
        adapter.display();
    }
}
