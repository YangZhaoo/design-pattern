package main.java.creation.singleton;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:11:48
 */
public enum EnumInstanceV2 {
    INSTANCE {
        protected void printTest() {
            System.out.println("hello world");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstanceV2 getInstance() {
        return INSTANCE;
    }
}
