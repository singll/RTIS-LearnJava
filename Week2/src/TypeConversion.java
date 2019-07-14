public class TypeConversion {
    public static void main(String[] args)
    {
        // 隐式类型转换，从int转float可能会丢失精度，即如果int的位数比float能表示的位数大，则会丢失精度
        int n = 123456789;
        float f = n;
        System.out.println(f); // 输出：1.23456792E8

        // 不同数值类型间进行四则运算会先进行转换，将其中的一个类型转成另一个类型，再进行计算
        // 转换优先级为 double->float->long->int，即如果其中有一个double类型，则另一个数字转成double再进行计算，之所以是这种优先级，是因为从位数少的类型转到类型高的类型不会丢失精度
        System.out.println(n+f); // 输出：2.46913584E8

        // 强制类型转换
        // 从double到int会进行截断，直接从小数位截，不会进行四舍五入
        double x = 9.997;
        int nx = (int)x;
        System.out.println(nx); // 输出：9

        // 进行舍入操作要用Math的方法
        int nx2 = (int)Math.round(x); // 由于round返回类型是long，所以此处需要强制类型转换
        System.out.println(nx2); // 输出：10


    }
}
