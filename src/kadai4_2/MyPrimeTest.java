package kadai4_2;

import org.junit.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class MyPrimeTest {
	private MyPrime mp;

	@Before // 各テストの実行前に行われる共通処理
	public void setUp() throws Exception {
		mp = new MyPrime();
	}

	@Test // テスト その1
	public void isPrimeに1を与えるとfalseを返す() {
		assertThat(mp.isPrime(1), is(false));
	}

	@Test // テスト その2
	public void isPrimeに2を与えるとtrueを返す() {
		assertThat(mp.isPrime(2), is(true));
	}

	@Test // テスト その3
	public void isPrimeに4を与えるとfalseを返す() {
		assertThat(mp.isPrime(4), is(false));
	}

	@Test // テスト その4
	public void isPrimeに7を与えるとtrueを返す() {
		assertThat(mp.isPrime(7), is(true));
	}

	@Test // テスト その5
	public void isPrimeに9を与えるとfalseを返す() {
		assertThat(mp.isPrime(9), is(false));
	}

	@Test // テスト その6
	public void isPrimeに13を与えるとtrueを返す() {
		assertThat(mp.isPrime(13), is(true));
	}

}
