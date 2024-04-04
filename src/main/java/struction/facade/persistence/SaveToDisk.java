package main.java.struction.facade.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:16:09
 */
public class SaveToDisk implements Persistence {
    @Override
    public void persistence(byte[] content) {
        String str = new String(content);
        try {
            FileWriter fw = new FileWriter("./tmp/page.txt");
            fw.write(str);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("will save to disk, length is " + content.length);
    }
}
