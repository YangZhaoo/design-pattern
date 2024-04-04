package main.java.struction.facade.parse;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:16:07
 */
public class ByteParse implements Parse {
    @Override
    public byte[] parse(byte[] bytes) {
        System.out.println("will decode by aes");
        return bytes;
    }
}
