package main.java.struction.adapter.classAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:12:10
 */
public class HDMIOutput {
    public Map<String, Object> hdOutput() {
        Map<String, Object> map = new HashMap<>();
        map.put("Image", "this is a image");
        map.put("Audio", "this is audio");
        return map;
    }
}
