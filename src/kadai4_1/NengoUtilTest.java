package kadai4_1;

import org.junit.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class NengoUtilTest {
	private NengoUtil nu;

	@Before // 各テストの実行前に行われる共通処理
	public void setUp() throws Exception {
		nu = new NengoUtil();
	}

	@Test
	public void isHeiseiYearに1970を与えるとfalseを返す() {
		assertThat(nu.isHeiseiYear(1970), is(false));
	}

	@Test
	public void isHeiseiYearに1988を与えるとfalseを返す() {
		assertThat(nu.isHeiseiYear(1988), is(false));
	}

	@Test
	public void isHeiseiYearに1989を与えるとfalseを返す() {
		assertThat(nu.isHeiseiYear(1989), is(true));
	}

	@Test
	public void isHeiseiYearに2000を与えるとtrueを返す() {
		assertThat(nu.isHeiseiYear(2000), is(true));
	}

	@Test
	public void isHeiseiYearに2019を与えるとtrueを返す() {
		assertThat(nu.isHeiseiYear(2019), is(true));
	}

	@Test
	public void isHeiseiYearに2020を与えるとfalseを返す() {
		assertThat(nu.isHeiseiYear(2020), is(false));
	}

	@Test
	public void isHeiseiYearに2030を与えるとfalseを返す() {
		assertThat(nu.isHeiseiYear(2030), is(false));
	}
}
