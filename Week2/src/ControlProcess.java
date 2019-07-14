public class ControlProcess {
    public static void main(String[] args)
    {

        // 块作用域
        int n = 1;
        {
            int i = n + 2; // 在子块中可以使用父块的变量
            // int n = 2; // 不可以在子块中定义同名变量，会冲突
        }
        // 但是在子块结束后，这里不可以使用子块里定义的变量
        // int a = i + 1; // 这是不合法的，会报错，提示没有定义i


        // 条件语句
        if(n == 1)
        {
            System.out.println("n == 1 ,会看到我"); // 根据if后面的判断条件，如果为真则执行这个代码块里的代码
        }
        // 如果为假，则跳过上面代码块，继续执行下面的语句

        if (n != 1)
        {
            System.out.println("跳过这条语句");
        }else {
            System.out.println("这个代码块会被执行"); // 可以使用if else 来执行，else表示除了上面为真的情况，执行这个代码块
        }

        if (n == 4)
        {
            System.out.println("n 是4");
        } else if (n == 2) {
            System.out.println("n 是2");
        } else if (n == 1) {
            System.out.println("猜对了");
        }else if(n == 1){
            System.out.println("但是不会再看到我了");
        } else {
            System.out.println("上面都没捕获的就交给我处理");
        }
        // 可以通过else if语句来依次来判断里面的语句是否为真，判断为真则执行代码块里的代码，然后忽略之后所有的else if 和else

        // 循环
        int i = 0;
        while(n == 1) // 当（）中的为真则执行下面的代码块，再执行一遍之后，再回到这个（），继续判断，为真则继续执行，如此循环，如果（）首次为false，则直接跳过代码块，连一次都不会执行
        {
            System.out.println(n);
            // 下面的是为了跳出循环，不然程序会一直执行，直到手动停止
            i++;
            if (i > 10){
                break; // 用来终止循环，当1 大于10 的时候，终止，终止循环之后继续沿着代码块之后的代码执行
            }
        }

        do {
            System.out.println("不论判断的结果是什么，我都会先输出一次，之后就和上面的while没区别了");
        }while(n==2);


        for (int a = 0; a < 10; a ++)   // 这是一个带条件的while，自带三段式，第一个是初始化一个变量，第二个是循环条件（为真则循环）,第三个是每次先执行的一段代码，一般用来对变量进行增量，比如i++,或者减量i--，当然也可以加任意数，比如i+3
        {
            System.out.println(a);
            // 代码块里可以放任意代码，这点再前面的代码块也一样，比如这里可以嵌套if else， 也可以嵌套while和for

        }

        // 多重选择
        switch(n) // n来和每个case后面的进行比较，如果相同则执行下面的代码
        {
            case 1: // case标签可以是char、byte、short、int、枚举常量、字符串字面量
                System.out.println("n 是 1 ，执行这里");
                break; // 这里的break是不必须的，但是如果不加，会从这里继续执行，而不是跳出这个switch
            case 2:
                System.out.println("如果不是上面的break，你就能看到我了");
                break;
            case 3:
                System.out.println("我要在上面两个break都没有的情况下才能看到");
                break;
            default:
                System.out.println("如果上面都匹配不上，执行我就对了");
                break; // 这个加与不加没区别，为了格式整齐就加上吧
        }

        // 中断控制流程语句
        // break 在上面已经简单介绍了，其实就是忽略下面的语句，从循环开始的地方继续执行，这里注意，如果是多层嵌套循环，则从本层的循环头开始执行
        // 如果想跳的更远，可以增加标签，直接跳到标签上
        zero:  // 标签用: 冒号来结尾
        for (int a1 = 0; a1 < 20 ; a1++)
        {

            for (int a2 = 0; a2 <20; a2 ++)
            {
                if(a2 == 10){
                    break zero; // 到10 就不输出了
                }
                System.out.println(a2);

            }
        }

        // continue与break一样，也是跳过剩下的代码



    }
}
