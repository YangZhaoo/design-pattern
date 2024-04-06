package main.java.struction.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:14:23
 */
public class Album extends Image {

    private List<Image> images = new ArrayList<>();
    private String name;

    public Album(String name) {
        this.name = name;
    }

    @Override
    public void add(Image image) {
        images.add(image);
    }

    @Override
    public void remove(int index) {
        this.images.remove(index);
    }

    @Override
    public int getCount() {
        return this.images.size();
    }

    @Override
    public void printName(int deepth) {
        // fixme
        StringBuilder preTrim = new StringBuilder();
        preTrim.append("│");
        for (int i = 1; i < deepth - 1; i++) {
            preTrim.append(" ");
        }
        preTrim.append("└─");
        System.out.println(preTrim + this.name);
        for (Image image : this.images) {
            image.printName(deepth + 1);
        }
    }
}
