public class Operator {
    public static void main(String[] args)
    {
        // 基本算术运算符 +、-、*、/ 即，加减乘除，以及求余 %
        // 按照书里说，由于Java的跨平台性，会保证在所有机器上运算结果一致
        int a = 5;
        int b = 2;
        System.out.println("5 + 2 = " + (a + b) );
        System.out.println("5 - 2 = " + (a - b));
        System.out.println("5 * 2 = " + (a * b));
        System.out.println("5 / 2 = " + (a / b) );
        System.out.println("5 % 2 = " + (a % b));

        // 一个数学运算库Math类
        double x = 4;
        double y = Math.sqrt(x); // 计算x的平方根，赋给y
        System.out.println(y); // 输出：2.0

        double y2 = Math.pow(x, 3); // 计算x的3次幂，赋给y2
        System.out.println(y2); // 输出：64.0
        // Math类还有好多方法，就不一一列举了，具体的可以参考Java手册

    }
}
