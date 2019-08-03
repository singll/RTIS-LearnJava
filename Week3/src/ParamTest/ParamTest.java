package ParamTest;

public class ParamTest {
    public static void main(String[] args)
    {
        /*
         * Test 1: Methods can't modify nemeric parameters
         */
        // 参数的按值传递
        // 即调用方法的时候是将值传过去的，在方法内部做的更改都不会反映到原变量
        // 用以下例子解释，调用 tripleValue的时候 是将 10 传过去了，而不是将变量percent传过去的，所以在tripleValue里的更改是在 数值 10 的基础上改，而不是改的percent变量
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        /*
         * Test2: Methods can change the state of object parameters
         */
        // 这里看到输出的是改完之后的值，因为传的是对象，但是还是按值传递
        // 这里传过去的是harry变量的值，在上面的例子是 数值10  ，但是这里由于是对象，不是基础类型，所以传过去的是一个“值”，这个值是对象的ID
        // 所以可以很简单的理解，由于传进去的ID没有改，而是通过ID调用对象里的方法，由于方法里的ID和变量的ID是同一个值，所以用的是同一个对象的方法，这个方法改变了属性，所以对象的状态发生改变，在外面获取属性的时候，就是改变之后的属性
        System.out.println("\nTest tripleSalary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        /*
         * Test 3: Methods can't attach new objects to object parameters
         */
        // 这里是为了证明传递的对象不是按引用传递
        // 由于传进去的是一个值的复制，对于值的更改，不会反应到原变量
        // 注意的点就是，虽然这里是对象，但是对象与基础类型的不一样的地方仅仅是，相同的对象的“值”可以操作同一个对象
        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        swap(a, b);
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());
    }

    public static void tripleValue(double x)  //doesn't work
    {
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }

    public static void tripleSalary(Employee x) // works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x.getSalary());
    }
    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }
}

class Employee  // simplified Employee class
{
    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
