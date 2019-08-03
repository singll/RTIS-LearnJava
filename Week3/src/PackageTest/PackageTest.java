package PackageTest;

// 导入包，一般在使用其他文件里的类的时候是需要导入类
import PackageTest.cc.singll.learnjava.Employee;

// 也可以导入类所在的包，这样就可以使用这个包里的所有类，比如这里的System，用*表示包下的所有类， static 的意思是导入静态的方法和静态的属性，这样就可以不用加类名了，直接当作在本类里的方法一样调用
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args)
    {
        // because of the import statement, we don't have to use
        // PackageTest.cc.singll.learnjava.Employee here
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of the static import statement, we don't hava to use System.out here
        out.print("name = " + harry.getName() + ", salary = " + harry.getSalary());
    }
}
