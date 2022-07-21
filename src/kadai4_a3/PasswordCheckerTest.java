package kadai4_a3;

import org.junit.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class PasswordCheckerTest {
    PasswordChecker pc;
    
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main(PasswordCheckerTest.class.getName());
    }

    @Before
    public void setUp() {
        pc = new PasswordChecker();
    }
    @Test
    public void testCheckPassword_01() {
        assertThat(pc.checkPassword(""), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_02() {
        assertThat(pc.checkPassword("a_4"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_03() {
        assertThat(pc.checkPassword("ab121"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_04() {
        assertThat(pc.checkPassword("ab1212"), is(PasswordChecker.PW_WEAK));
    }
    @Test
    public void testCheckPassword_05() {
        assertThat(pc.checkPassword("abXXab"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_06() {
        assertThat(pc.checkPassword("121212"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_07() {
        assertThat(pc.checkPassword("ab-_ab-"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_08() {
        assertThat(pc.checkPassword("12-12_3"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_09() {
        assertThat(pc.checkPassword("1234abc"), is(PasswordChecker.PW_WEAK));
    }
    @Test
    public void testCheckPassword_10() {
        assertThat(pc.checkPassword("0909aza"), is(PasswordChecker.PW_WEAK));
    }
    @Test
    public void testCheckPassword_11() {
        assertThat(pc.checkPassword("_abc123"), is(PasswordChecker.PW_WEAK));
    }
    @Test
    public void testCheckPassword_12() {
        assertThat(pc.checkPassword("abc123DEF"), is(PasswordChecker.PW_WEAK));
    }
    @Test
    public void testCheckPassword_13() {
        assertThat(pc.checkPassword("abc123-Def"), is(PasswordChecker.PW_STRONG));
    }
    @Test
    public void testCheckPassword_14() {
        assertThat(pc.checkPassword("abc#123"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_15() {
        assertThat(pc.checkPassword("abc?123def"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_16() {
        assertThat(pc.checkPassword("0000-ZZZZ"), is(PasswordChecker.PW_STRONG));
    }
    @Test
    public void testCheckPassword_17() {
        assertThat(pc.checkPassword("0aA--%"), is(PasswordChecker.PW_INVALID));
    }
    @Test
    public void testCheckPassword_18() {
        assertThat(pc.checkPassword("0aA-$"), is(PasswordChecker.PW_INVALID));
    }
}
