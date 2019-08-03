package StaticTest;

public class StaticTest {
    public static void main(String[] args)
    {
        // fill the staff array with three EmployeeTest.StaticTest.Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        // print out information about all Employee objects
        for (Employee e : staff)
        {
            e.setId();
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
        }

        int n = Employee.getNextId();  // calls static method
        System.out.println("Next available id=" + n);

    }
}

class Employee
{
    // 静态属性，这个属性属于类，正常的属性是每个对象都有自己的一份不同属性，当对象更改自己的属性的值的时候不会影响到其他对象，但是静态属性是所有对象共用一个，当某个对象调用方法或直接更改静态属性的时候，所有的对象访问这个属性就会发现都发生改变了
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n , double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId;  // set id to next available id
        nextId++;
    }

    // 静态方法，也是属于类，调用方式是 类名.静态方法名（参数）   比如 Employee.getNextId()  ，而且不可以用对象调用
    public static int getNextId()
    {
        return nextId;  // returns static field
    }

    public static void main(String[] args)     // unit test
    {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
