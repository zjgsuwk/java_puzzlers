package _1st_chapter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

/**
 * author: victory_always
 * mail: zjgsuwk@163.com
 * time: 2017-12-31 12:05
 */
@DisplayName("判断奇偶数方法v2和v3的性能比较")
public class OddUtilsV3vsV2Test {

    abstract class Invoker{

        public long consume(final int count){

            long sum = 0;

            long startTime = 0;

            int i = 0;

            while(i++<count){

                startTime = System.currentTimeMillis();

                execute();

                sum+=(System.currentTimeMillis()-startTime);

            }
            return sum;

        }
        public abstract void execute();
    }

    @Test
    @DisplayName("比较v2和v3版本的性能")
    @RepeatedTest(99)
    public void compareV3AndV2Test(){

        int executeCount = 100;

        int number = Integer.MAX_VALUE;

        long consumeTime4V3 = new Invoker() {
            @Override
            public void execute() {
                OddUtils.isOddV3(number);
            }
        }.consume(executeCount);

        long consumeTime4V2 = new Invoker(){
            @Override
            public void execute(){
                OddUtils.isOddV2(number);
            }
        }.consume(executeCount);

        Assert.assertTrue(String.format("判断[%s]是否为奇数，v2版本花费时间[%s]毫秒，v3版本花费时间[%s]毫秒",number,consumeTime4V2,consumeTime4V3),consumeTime4V2>=consumeTime4V3);

    }
}
