package main.java.creation.singleton.bean;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:11:48
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
