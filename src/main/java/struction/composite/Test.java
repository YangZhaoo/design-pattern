package main.java.struction.composite;


/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:14:30
 *
 * JDK中的组合模式
 * {@link java.awt.Container}
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Image avenger = new Album("Stan Lee");
        avenger.add(new Photo("Iron man", 102400));
        avenger.add(new Photo("thor", 96000));
        avenger.add(new Photo("Captain America", 138000));
        Image jinyongArts = new Album("金庸");
        jinyongArts.add(new Photo("萧峰", 182));
        jinyongArts.add(new Photo("郭靖", 180));
        Image yiTian = new Album("倚天屠龙记");
        yiTian.add(new Photo("张翠山", 32));
        yiTian.add(new Photo("俞莲舟", 40));
        yiTian.add(new Photo("张真人", 200));
        jinyongArts.add(yiTian);
        Image luD = new Album("鹿鼎记");
        luD.add(new Photo("陈若华", 175));
        luD.add(new Photo("玄烨", 89));
        luD.add(new Photo("韦小宝", 165));
        jinyongArts.add(luD);

        Album stars = new Album("超级英雄");
        stars.add(avenger);
        stars.add(jinyongArts);

        stars.printName(0);
    }
}
