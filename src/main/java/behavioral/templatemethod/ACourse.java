package main.java.behavioral.templatemethod;

public abstract class  ACourse {

    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteActicle()) {
            makeArticle();
        }
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频 ");
    }

    final void makeArticle() {
        System.out.println("制作手记");
    }

    protected boolean needWriteActicle() {
        return false;
    }

    abstract void packageCourse();

}
