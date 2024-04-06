package main.java.struction.flyweight;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:13:11
 */
public class Manager implements Employee {
    private String department; // 外部状态
    private String title = "部门经理"; // 内部状态
    private String reportContent;
    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(this.reportContent);
    }
}
