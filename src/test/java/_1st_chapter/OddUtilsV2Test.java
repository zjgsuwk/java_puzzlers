package _1st_chapter;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@DisplayName("奇数工具类测试，测试isOdd方法")
public class OddUtilsV2Test {

    /**
     *  测试是否isOdd方法有5个case
     *  case1: 正偶数
     *  case2: 正奇数
     *  case3: 0
     *  case4: 负偶数
     *  case5: 负奇数
     */

    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试正偶数")
    public void isOddCase1() throws Exception {

        assertFalse(OddUtils.isOddV2(2));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试正奇数")
    public void isOddCase2() throws Exception {

        assertTrue(OddUtils.isOddV2(1));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试0")
    public void isOddCase3() throws Exception {

        assertFalse(OddUtils.isOddV2(0));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试负偶数")
    public void isOddCase4() throws Exception {

        assertFalse(OddUtils.isOddV2(-2));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试负奇数")
    public void isOddCase5() throws Exception {

        assertTrue("负奇数也可以测试通过",OddUtils.isOddV2(-3));
    }

}