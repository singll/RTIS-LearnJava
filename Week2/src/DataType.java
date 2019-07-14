public class DataType {
    public static void main(String[] args)
    {
        // 整型，分四种，分别为 int 、 short 、 long 、 byte
        // int，整型，占4个字节，取值范围：-2,147,483,648    +2,147,483,647
        int intPrice0;
        intPrice0 = 2147483647;
        int intPrice1 = -2_147_483_648;

        // short，整型，占2个字节，取值范围：-32 768        +32 767
        short shortPrice0;
        shortPrice0 = 32767;
        short shortPrice1 = -32_768;

        // long，整型，占8个字节，取值范围：-9 223 372 036 854 775 808    +9 223 372 036 854 775 807
        long longPrice0;
        longPrice0 = 9223372036854775807L; // 注意，必须在数字后面加一个字母L或小写l，不然会被识别为int类型
        long longPrice1 = -9_223_372_036_854_775_808l;

        // byte，整型，占1个字节，取值范围：-128       +127
        byte bytePrice0;
        bytePrice0 = 127;
        byte bytePrice1 = -128;

        // 还可以使用二进制、八进制、十六进制赋值
        int intPrice2 = 0b1001; // 二进制赋值，可以使用0b或者0B前缀来表示
        System.out.print("intPrice2=");
        System.out.println(intPrice2); // 输出：9

        int intPrice3 = 010; // 八进制赋值，以0开头，容易混淆，谨慎使用
        System.out.print("intPrice3=");
        System.out.println(intPrice3); // 输出：8

        int intPrice4 = 0xCAEF; // 十六进制赋值，可以使用0x或者0X前缀来表示
        System.out.print("intPrice4=");
        System.out.println(intPrice4); // 输出：51951



        // 浮点类型，两种，float 、 double
        // float，浮点数，占4个字节，取值范围 大约 -3.402 823 47 * 10的38次方    +3.402 823 47 * 10的38次方 用科学计数法表示为 大约正负 3.402 823 47E38F
        float floatPrice0;
        floatPrice0 = 3.14F; // 注意，必须在数字后面加F或f，不然会被识别为double
        float floatPrice1 = -3.14f;

        // double,浮点数，占8个字节，取值范围 大约 -1.797 693 134 862 315 70 * 10的308次方    +1.797 693 134 862 315 70 * 10的308次方 用科学计数法表示为 大约正负 1.797 693 134 862 315 70E308
        double doublePrice0;
        doublePrice0 = 3.14; // double可以不加后缀，也可以在数字后面加D或d
        double doublePrice1 = -3.14D;

        // 浮点数有三个特殊的浮点数值，正无穷大、负无穷大、NAN（不是一个数字）
        // 例子
        double doublePrice2 = 33/0.0; // 注意除数不能写成0，会报错
        System.out.print("（正无穷）doublePrice2 = ");
        System.out.println(doublePrice2); // 输出：Infinity

        double doublePrice3 = (-33)/0.0; // 注意除数不能写成0，会报错
        System.out.print("（负无穷）doublePrice3 = ");
        System.out.println(doublePrice3); // 输出：-Infinity

        double doublePrice4 = 0/0.0; // 注意除数不能写成0，会报错
        System.out.print("（NaN）doublePrice4 = ");
        System.out.println(doublePrice4); // 输出：NaN

        // 如果需要判断是否是特殊数值，请用方法来判断
        System.out.println("doublePrice4 is NaN ? " + Double.isNaN(doublePrice4));
        // 如果用 == 来判断，会出现错误的结果
        System.out.println("(Mistake)doublePrice4 is NaN ？" + (doublePrice4 == Double.NaN)); // 判断永远为false，与书上写的不一致，以实践结果为准



        // char类型
        char charTest0 = 'A';
        System.out.println("charTest0 is "+ charTest0);
        char charTest1 = '\u03C0';
        System.out.println("charTest1 is " + charTest1);
        // 注：char类型应用场景很少，正常建议使用String类型



        // boolean类型
        boolean booleanValue0 = true;
        boolean booleanValue1 = false;
        // 注，boolean只有这两个值，表示真和假



        // 变量与常量
        // 上面广泛使用的就是变量的定义
        int i; // 声明变量i为int类型
        i = 1; // 将i赋值为1
        int a = 2; // 也可以在声明的同时直接初始化为某个值
        int j,k,n,m; // 也可以同时声明多个变量，用逗号，分隔

        final int CONT_INT_PRICE = 30; // 常量用final 修饰，惯例是变量名大写，便于与变量区分
        // CONT_INT_PRICE = 23; // 对常量的值进行修改会报错
        final int CONT_INT_PP;
        CONT_INT_PP = 25; // 可以先声明，再赋值
        // CONT_INT_PP = 55; // 赋值过之后再更改就会报错，即如果声明的同时没有初始化，第一次赋值的时候是合法的，第二次修改就会报错
    }
}
