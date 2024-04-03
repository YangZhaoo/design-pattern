package main.java.factory.simpleFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:15:43
 */
public class VideoFactory {
    public Video getVideo(String type){
        if ("Java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } if ("Python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }

    public Video getVideoByReflact(Class c){
        Video video = null;
        try {
            video = (Video) c.getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return video;
    }
}
