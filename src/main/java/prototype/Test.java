package main.java.prototype;

import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:14:59
 *
 * jdk中实现的深克隆
 * {@link java.util.ArrayList#clone}
 * {@link java.util.HashMap#clone}
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Message template = new Message("Zhangsan",
                "somebody",
                "Notify",
                "it's time to pay free of house",
                new Date());
        System.out.println(template.hashCode() + "  " + template.getData().hashCode());
        for (int i = 0; i < 5; i++) {
            Message msg = (Message) template.clone();
            msg.setTo(String.format("%03d", i));
            System.out.println("send Msg: " + msg + "   ["+ msg.hashCode() + "  " + msg.getData().hashCode() + "]");
        }
    }
}
