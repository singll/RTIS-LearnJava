package EmployeeTest;
// 上面的是包名，Java使用包来分隔不同的类，以达到方便定位，方便命名的作用

import java.time.*;

// 定义类，注意此类与文件名一致，并且大小写相同
public class EmployeeTest {
    public static void main(String[] args)
    {
        // 创建Employee的数组，有三个元素，Employee在下面定义的
        // fill the staff array with three EmployeeTest.Employee objects
        Employee[] staff = new Employee[3];

        // j实例化对象，使用new 关键字，new classname()，括号里的是参数，实例化的时候会调用构造方法
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // rise everyone's salary by 5%
        for (Employee e : staff)
        {
            // 使用对象调用方法
            e.raiseSalary(5);
        }

        // print out information about all EmployeeTest.Employee objects
        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}

// 注意，这里由于是一个文件里的第二个类，所以一定不要使用修饰符，此类的可见范围是包内可见
class Employee
{
    // 定义属性 private是私有的，可见范围是类内，也就是说只有Employee类可以使用这个name  ， String是类型，同样，可以使用对象来作为类型    可以在后面直接赋初始值
    private String name = "test";
    private double salary;
    private LocalDate hireDay;

    // 构造方法 方法名与类名相同，可以有多个构造方法，但是参数不同，构造方法没有返回值，可以看到这个类里没有main方法，这是因为只需要一个入口方法。 这里定义了五个参数，并且在方法体里将获取到的参数赋值给属性
    public Employee(String n, double s, int year, int month, int day)
    {
        // 将传进来的参数值赋值给属性name
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // 由于属性是private ，所以这里有一个public的方法来暴露给外界，以供获取name的值
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

    // 普通方法，如果没有返回值就用void，如果有返回值就在void的位置填返回值类型
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
