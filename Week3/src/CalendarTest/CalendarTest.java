package CalendarTest;

//导入类库，虽然是Java标准类库，但是除了几个基本的，其他都需要导入，不然无法使用
import java.time.*;

//定义类   public 是公开的，谁都可以使用这个类  class 关键词，定义类的时候必须要写的   CalendarTest 是类名，一个Java文件里必须有一个与文件名一致的类，并且一定要用public修饰，如果同一个文件里有多个类，那么其他的类都不可以带任何修饰符，形如 class test{}    类名后面跟着的是由一对大括号组成的块，块里所有的代码都属于这个类
public class CalendarTest {

    // public 是与类修饰符一样的意义 static是静态方法的修饰符，这里定义是因为main方法必须由static修饰  void 这里是返回值类型，由于main方法没有返回值，所以由void代替，如果是其他方法，有返回值，此处是返回值的类型，可以是基础类型，也可以是对象类型   main 就是方法名，这里的main是固定的，其他方法可以自由命名，命名规则同变量   括号里的就是参数，多个参数用逗号（,）分隔，参数的形式就是：数据类型 变量名。
    public static void main(String[] args)
    {
        // 这里是调用的LocalDate类的new()方法，这个是静态方法的调用方式，然后赋值给一个LocalDate对象
        LocalDate date = LocalDate.now();

        // 使用date（LocalDate对象）来进行调用方法
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        // 以下可以自己运行一下，看一看输出
        date = date.minusDays(today - 1); // Set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();  // 1 = Monday, ... 7 - Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
