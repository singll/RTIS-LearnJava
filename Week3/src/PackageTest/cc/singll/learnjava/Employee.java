package PackageTest.cc.singll.learnjava;
// 包名，这里的包要和物理路径对应上，比如 此文件的物理路径就是 PackageTest/cc/singll/learnjava/Employee.java

import java.time.*;

// 这里将类分开了，其他的类里想用Employee的类，直接导入类，就可以使用了
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
