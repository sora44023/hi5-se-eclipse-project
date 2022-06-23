package unittest;

import org.junit.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalcTest {
	private Calc cal;

	@Before // 各テストの実行前に行われる共通処理
	public void setUp() throws Exception {
		cal = new Calc();
	}

	@Test // テスト その1
	public void addに3と4を与えると7を返す() {
		assertThat(cal.add(3, 4), is(7));
	}

	@Test // テスト その2
	public void multiplyに20と3を与えると60を返す() {
		assertThat(cal.multiply(20, 3), is(60));
	}
}
