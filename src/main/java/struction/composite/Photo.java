package main.java.struction.composite;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:14:22
 */
public class Photo extends Image {

    private String name;
    private int size;

    public Photo(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void printName(int deepth) {
        StringBuilder preTrim = new StringBuilder();
        preTrim.append("│");
        for (int i = 1; i < deepth - 1; i++) {
            preTrim.append(" ");
        }
        preTrim.append("└─");
        System.out.println(preTrim + this.name);
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
