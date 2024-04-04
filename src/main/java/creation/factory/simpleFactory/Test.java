package main.java.creation.factory.simpleFactory;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:15:44
 *
 * 简单工厂模式，通过工厂的方法创建需要的对象。
 * {@link java.util.Calendar#getInstance}
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("Python");
        if (video != null) {
            video.produce();
        }
        Video javaVideo = videoFactory.getVideoByReflact(JavaVideo.class);
        javaVideo.produce();
    }
}
