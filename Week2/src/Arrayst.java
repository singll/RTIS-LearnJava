import java.util.*;

public class Arrayst {
    public static void main(String[] args)
    {
        // 数组

        int[] a; // 声明int型数组 a，这里也可以写成 int a[]; 数组里必须存放int型
        a = new int[100]; // 初始化数组，必须在用之前就确定数组是多少个元素，在后面int[]里存放的数组一共有多少个元素

        int[] b = new int[200]; // 也可以直接初始化
        // 初始化的时候，int数组在没赋值的情况下，每个元素都是0，boolean数组是false，对象数组是null

        a[10]  = 100;   // 可以通过下标来对单个进行赋值
        System.out.println(a[10]); //可以直接按下标来取，注意下标是从0开始，即a[0]是第一个元素，以此类推，a[100-1]即是最后一个元素，a[n-1] n为数组元素个数
        for (int i = 0; i < 100; i ++)   // 常见的用法是用循环进行赋值
        {
            a[i] = i;
        }

        for (int i = 0; i < 100 ; i ++)
        {
            System.out.println(a[i]);// 通过循环来遍历输出数组各个元素
        }

        for(int a3 : a) // foreach 是系统自带的简单的for实现，语法是for(变量：数组)   这样就不用自己设置循环次数，foreach会保证每个元素循环到
        {
            System.out.println(a3);
        }

        // 数组拷贝
        int[] lockyNumbers = a;
        a[0] = 123;
        System.out.println(lockyNumbers[0]);// 注意，这里两个数组使用的是同一组数据，改一个另一个也会变,输出：123

        lockyNumbers = Arrays.copyOf(a, a.length); // 如果希望各自维护一套元素，则使用copyOf来进行拷贝
        a[1] = 234;
        System.out.println(lockyNumbers[1]);// 输出：1

        // main方法的参数args就是一个数组，从命令行进行读取参数，放到args里
        // 如果运行 java Arrayst.java test aaa bbb
        // 则args[0] = "test"，args[1] = "aaa" ，args[2] = "bbb"

        // 数组排序
        Arrays.sort(a); // 对数组进行了排序

        // 多维数组
        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };
        // 多维数组的初始化，一维数组也可以直接初始化，注意用{}来进行初始化

        for (int i = 0; i < magicSquare.length;i++)  // 多维数组的遍历方式，即循环嵌套循环
        {
            for (int j =0; j < magicSquare[i].length; j++)
            {
                System.out.println(magicSquare[i][j]);
            }
        }

        // 二维数组的第二维不是必须长度相同，可以每个都不同，利用循环初始化


    }
}
