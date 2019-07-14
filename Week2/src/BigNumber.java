import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args)
    {
        // 大数值
        BigInteger a = BigInteger.valueOf(100); // 可以通过valueOf() 来进行转换
        BigInteger b = BigInteger.valueOf(200);
        BigInteger c = a.add(b); // 运算的话必须通过这种调用方法的形式，而不可以用四则运算符，并且参数必须是大数值格式，不能是int等，这是进行a+b
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); // d = c * (b+2)

        // 解锁更多方法请看手册和书，不是需要很精准的地方一般用不到
    }
}
