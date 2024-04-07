package main.java.behavioral.templatemethod;

public class FECourse extends ACourse {

    private boolean needWriteArticleFlag;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供前端课程代码");
        System.out.println("提供课程图频等多媒体素材");
    }

    @Override
    protected boolean needWriteActicle() {
        return needWriteArticleFlag;
    }
}
