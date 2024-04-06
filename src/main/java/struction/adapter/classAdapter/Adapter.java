package main.java.struction.adapter.classAdapter;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:12:11
 */
public class Adapter extends HDMIOutput implements VGADisplay {
    @Override
    public void display() {
        Map<String, Object> hdSign = super.hdOutput();
        System.out.println(hdSign.get("Image") + " display by VGA Adapter");
    }
}
