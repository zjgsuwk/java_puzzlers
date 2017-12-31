package _1st_chapter;

/**
 * author: victory_always
 * mail: zjgsuwk@163.com
 * time: 2017-12-31 10:47
 * desc: 简书文章地址:http://www.jianshu.com/p/886fda501059
 */
public class OddUtils {

    /**
     * 判断一个整数是否是奇数
     * @param number
     * @return
     */
    public static boolean isOdd(int number){
        return number % 2 == 1;
    }
    /**
     * 判断一个整数是否是奇数v2
     * @param number
     * @return
     */
    public static boolean isOddV2(int number){
        return number % 2 != 0;
    }
    /**
     * 判断一个整数是否是奇数v3(更高效)
     * @param number
     * @return
     */
    public static boolean isOddV3(int number){
        return (number & 1) != 0;
    }

}
