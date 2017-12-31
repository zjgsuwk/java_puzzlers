package _1st_chapter;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@DisplayName("奇数工具类测试")
public class OddUtilsV3Test {

    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试正偶数")
    public void isOddCase1() throws Exception {

        assertFalse(OddUtils.isOddV3(2));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试正奇数")
    public void isOddCase2() throws Exception {

        assertTrue(OddUtils.isOddV3(1));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试0")
    public void isOddCase3() throws Exception {

        assertFalse(OddUtils.isOddV3(0));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试负偶数")
    public void isOddCase4() throws Exception {

        assertFalse(OddUtils.isOddV3(-2));

    }
    /**
     * @throws Exception
     */
    @Test
    @DisplayName("测试负奇数")
    public void isOddCase5() throws Exception {

        assertTrue("负奇数测试通过",OddUtils.isOddV3(-3));

    }

}