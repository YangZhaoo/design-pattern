package main.java.struction.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:13:11
 */
public class EmployFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();
    public static Employee getEmployee(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            System.out.print(department + "部门正在创建报告...   ");
            manager = new Manager(department);
            manager.setReportContent(department + "部门报告内容如下：......");
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
