package PackageTest;

import PackageTest.cc.singll.learnjava.Employee;

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
