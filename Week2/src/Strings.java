import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class Strings {
    public static void main(String[] args) throws IOException
    {
        // 字符串，就是由字符组成的串（貌似废话-。-）
        String e = "";  // 定义了一个空字符串，定义方式与其他变量一样，不在赘述。这里注意S一定要大写
        String greeting = "HelloWorld";

        // 字串操作
        String s = greeting.substring(0, 3); // 从greeting中提取字符串，然后赋给新的变量，两个参数分别表示，从哪个位置开始（从0开始，大部分编程语言的默认索引都是从0开始）、到哪个位置结束（不包含当前数字位置）
        System.out.println(s); // 输出：Hel

        // 拼接
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13; // 直接使用加号，将两个字符串拼接起来，赋值给message
        System.out.println("message = " + message); // 输出：message = Expletivedeleted

        int age = 13;
        String rating = "PG" + age; // 可以用其他类型与字符串进行拼接，int将转换成String，任何一个对象都可以转换成字符串，后续有详细讲解
        System.out.println("rating = " + rating); // 输出：rating = PG13

        String all = String.join(" /" , "S", "M", "L", "XL"); // 如果拼接的太多，可以考虑用String.join方法，第一个参数是拼接符，将后面N个参数（字符串）拼接起来，变成一个字符串
        System.out.println("all = " + all);  // 输出：all = S /M /L /XL

        // 这里有个概念，叫不可变字符串，即字符串是不可修改的
        greeting = "test"; // 这里的含义是，将greeting变量重新赋值成test，即在内存中重新创建一个test的字符串，然后将greeting指向test，原来的HelloWorld还在原来的内存位置，并没有被修改
        // 由于指向 HelloWorld 的变量名没有了，所以并不能再使用，不过不用担心，java 的 GC 会对这种内存进行回收，不用担心占用太多内存


        // 比较两个字符串是否相同
        System.out.println("test".equals(greeting)); // 前面可以是变量，也可以是现写的字符串，同理，参数也可以是字符串，也可以是变量
        System.out.println(greeting.equalsIgnoreCase("TEST")); // 忽略大小写的比较
        System.out.println(greeting == "test"); // ！！！不要使用 == 来比较两个字符串是否相等，因为这不可靠，由于Java的机制， == 比较的是两个字符串是否是同一个，而不是他们是否相等，由于Java会共享相同常量，所以这两个test实际是再同一个内存位置

        // 空串 和 null
        if (e.length() == 0)  // 使用字符串的长度来判断
        {
            System.out.println("e is empty String");
        }

        if (e.equals(""))    // 也可以用方法来判断
        {
            System.out.println("e allways is empty String");
        }

        String str = null;
        if (str == null)         // 用== 来判断是否是null，null与""不一样，注意需要使用的时候两个都需要判断
        {
            System.out.println("str is null");
        }


        // 码点与代码单元
        int n = greeting.length(); // 通过length()获得代码单元数量
        System.out.println(n); // 输出：4
        int cpCount = greeting.codePointCount(0, greeting.length()); // 通过.codePointCount()获取码点数量，第一个参数是从哪个位置开始
        System.out.println(cpCount); // 输出：4                      由于这里都是字母，所以与代码单元数量相同

        char first = greeting.charAt(0); // 通过.charAt()获取第N个位置的代码单元

        // 通过以下代码获取第i个码点
        int i = 2;
        int index = greeting.offsetByCodePoints(0, i);
        int cp = greeting.codePointAt(index);

        // 关于码点操作和其他StringAPI就不多演示，很多API还是很有用处的，建议多看看，最起码熟悉可以使用API做到什么操作，这样以后需要用到的时候进行查手册

        // StringBuilder 这个用的比较多，这是String可修改的版本
        StringBuilder builder = new StringBuilder();   // 这里使用了new操作符，再后续会详细讲，这里知道必须这样用就好
        builder.append("abc"); // 上面创建完StringBuilder对象之后，使用builder调用方法向对象里添加字符
        builder.append("def");
        System.out.println(builder); // 输出：abcdef
        String completedString = builder.toString(); // 也可以调用.toString()方法转成String


        // 输入输出，到现在运行程序都是直接输出，然后程序就停止了，现在可以从控制台里读取用户的输入
        Scanner in = new Scanner(System.in); // 注意这个不是Java标准库的里，所以需要导入，请注意文件顶部多的代码，这一行是new 对象
        System.out.print("what is your name? "); // 给与提示
        String name = in.nextLine();     // 从控制台等待用户输入，换行结束等待，然后将用户输入的字符串保存到name里
        System.out.println("Hello " + name);
        String firstName = in.next();    // 也是从控制台等待输入，区别就是上面的可以保存一整行，这个方法只能保存住空格之前或者换行之前的
        System.out.println(firstName); //  比如如果输入 sing ll aa bb ，那么firstName 里只会存下sing

        System.out.print("How old are you");
        int age1 = in.nextInt(); // 只读取int，读取浮点数用in.nextDouble()
        System.out.println("your age is " + age1);



        // 格式化输出
        double x = 1000.0/3.0;
        System.out.println(x);

        System.out.printf("%8.2f", x); // 使用printf方法进行格式化输出，表示小数点前方有8个字符宽度，小数点后2个字符，输出：  333.33
        System.out.println(); // 增加一个空格以分开上下两个输出的显示
        System.out.printf("%,.2f", 10000.0/3.0); // 注意使用,号分隔，便于看数字位数 输出：3,333.33

        // 格式化输出异常强大，可以有N多组合格式，没有办法都列出来，所以请看书和文档来进行组合输出


        // 文件输入和输出
        Scanner in1 = new Scanner(Paths.get("myfile.txt"), "UTF-8"); // 注意：这里需要再main附近添加抛异常的关键词，还需要导入包，请见文件头部
        // 将读取文件，将内容放到in中
        PrintWriter out = new PrintWriter("myfileout.txt","UTF-8"); // 注意：这也需要引入类库
        out.print("test out"); // 向文件中写入内容

        // 注：这里没有写路径，就是再当前路径下找文件，除了这种相对路径的方式，也可以使用绝对路径，比如C:\\mydirectory\\myfile.txt
        // 注意这里的\ 使用了两个，/ 则不用



    }
}
