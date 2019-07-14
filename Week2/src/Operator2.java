public class Operator2 {
    public static void main(String[] args)
    {
        // 赋值与运算符结合，得到简略形式
        int x = 1;
        x += 4; // += 运算符表达的意义为 x = x + 4
        // x = x + 4; // 即上面的完整形式
        // 更多的类似运算符 += 、 -= 、 *= 、/= 、 %=
        x /= 4;

        // 自增自减运算符
        x++; // 即 x = x + 1;
        x--; // 即 x = x - 1;

        // 比较运算符
        boolean b_1 = (3 == 7); // == 用来检测两个数字、变量或对象的相等性，返回boolean值，注意：用 == 来判断两个对象只会判断是否是同一对象
        boolean b_2 = (3 != 7); // != 用来检测不等性，正好与上面相反，用法一样
        // 其他通常用于比较数值的还有 大于 > 、小于 < 、 大于等于 >= 、 小于等于 <=
        // 举个栗子
        boolean b_3 = (3 <= 7);

        // 逻辑运算符 与或非 && || !
        // 其中与、或 是需要两个返回值为boolean的表达式，非 只需要一个
        boolean b_4 = (x != 0) && (x > 0); // 与 逻辑运算符，当两个表达式的结果都为true（真）的时候，b_4 为 true，其余情况为false。此值为真
        boolean b_5 = (x == 0) || (x < 0); // 或 逻辑运算符，当两个表达式结果都为false（假）的时候，b_5为false，其余情况为true，此值为假
        // && 与 || 都存在短路操作，即，如果在获得符号前面部分表达式的结果，就能得到整个表达式的结果，将不会运行符号后面的表达式
        // 栗子： (x == 0) && (x > 0)  ;由于&&符号的特性，在(x == 0)为假的情况下，整个表达式返回结果必然为假，所以后面的( x > 0)不会运行（注意是不会运行）
        // 再来个栗子： (x != 0) || (x < 0)    ;由于||符号的特性，再(x != 0)为真的情况下，整个表达式返回结果必然为假，所以后面的(x < 0)不会运行
        boolean b_6 = !(x == 0);           // 非 逻辑运算符，当表达式为真，返回结果为假，当表达式结果为假，返回结果为真，即将表达式的boolean值反转一下

        // 三元操作符 ?:
        String result = (x != 0)? "aaa" :"bbb"; // 问号之前的表达式必须返回值为boolean，然后如果为true，则执行问号和冒号中间的语句，如果为false，则执行冒号后面的语句
        System.out.println(result); // 输出：aaa
        // (x != 0)?System.out.println("aaa"):System.out.println("bbb");
        // 注：上面注释里这句会被识别成错误，编译不通过，要将整个三元表达式赋值给一个变量，不清楚是不是由于IDE

        // 位运算符& | ^ ~   ，位与  位或 位异或 位非
        // 与逻辑运算符差不多，不过是针对位来进行的运算，多了个异或，异或是在两个条件同时为真或同时为假的时候，结果为假，不同时为真
        byte n = 127;
        int fourthBitFromRight = (n & 0b1000); // 0b1111 & 0b1000 = 0b1000; 换算成10进制为8
        System.out.println(fourthBitFromRight); // 输出：8

        // 左移 <<  右移 >> 以0填充的 右移 >>>
        int intUse0 = 8; // 0b 0000 0000 0000 0000 0000 0000 0000 1000
        int intUse1 = (intUse0 >> 2); // 0b 0000 0000 0000 0000 0000 0000 0000 0010 ,所有位向右移2位，左侧以符号位填充，正数的符号位为0，所以填充0
        System.out.print("intUse0 的二进制：");
        System.out.println(Integer.toBinaryString(intUse0)); // 输出：1000
        System.out.print("intUse1 的二进制：");
        System.out.println(Integer.toBinaryString(intUse1)); // 输出：10


        // 注，负数采用补码方式，所以负数是反着来的
        int intUse2 = -128; // 0b 1111 1111 1111 1111 1111 1111 1000 0000   注意，左边的第一位是符号位，负数为1，正数为0
        int intUse3 = (intUse2 >> 3); // 0b 1111 1111 1111 1111 1111 1111 1111 0000 整体向右移三位，并且以符号位填充
        System.out.print("intUse2 的二进制：");
        System.out.println(Integer.toBinaryString(intUse2)); // 输出：11111111111111111111111110000000
        System.out.print("intUse3 的二进制：");
        System.out.println(Integer.toBinaryString(intUse3)); // 输出：11111111111111111111111111110000

        int intUse4 = (intUse2 >>> 3); //0b 0001 1111 1111 1111 1111 1111 1111 0000 整体向右移三位，符号位以0填充
        System.out.println(intUse4);
        System.out.print("intUse4 的二进制：");
        System.out.println(Integer.toBinaryString(intUse4)); // 输出：11111111111111111111111110000



        // 运算符的优先级，这里只举个栗子，具体的看《运算符优先级》表，平常就使用（）就好，一般不要依赖优先级，首先不容易调试，其次看起来也很乱
        int a1, b1, c1;
        a1 = 3;
        b1 = 5;
        c1 = 7;
        a1 += b1 += c1; // 因为同属同一个操作符，并且此操作符是从右向左，所以先计算 b1+=c1 ，在计算 a1 += ((b1+=c1)的结果)
        // a1 += (b1 += c1);   // 与上面等价

        int result1 = a1 + b1 - c1; // 因为+ 和 - 同级，并且与数学运算顺序一样，从左至右
        // int result1 = (a1 + b1) - c1;   // 与上面等价
        // 其他不一一举例，有需要看请看书里相关章节的表

    }
}
