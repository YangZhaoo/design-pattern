package main.java.struction.adapter.objectAdapter;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:12:11
 */
public class Adapter implements VGADisplay {
    private HDMIOutput hdmiOutput = new HDMIOutput();
    @Override
    public void display() {
        Map<String, Object> hdSign = hdmiOutput.hdOutput();
        System.out.println(hdSign.get("Image") + " display by VGA Adapter");
    }
}
