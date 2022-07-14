package kadai4_a1;

import org.junit.*;

import kadai4_a1.Rectangle.OverlapState;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class RectangleTest {
	private Rectangle r;
	
	@Before // 各テストの実行前に行われる共通処理
	public void setUp() throws Exception {
		r = new Rectangle(4,4,4,4);
	}
	
	@Test // テスト その1
	public void thisとrが同じ大きさの長方形を与えるとOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(4,4,4,4)), is(OverlapState.OVERLAP));
	}
	
	@Test // テスト その2
	public void rがthisより小さい長方形を与えるとINを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,5,2,2)), is(OverlapState.IN));
	}
	
	@Test // テスト その3
	public void rがthisより右だけ長い長方形を与えるとOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,5,3,3)), is(OverlapState.OVERLAP));
	}

	@Test // テスト その4
	public void rがthisの外側にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(1,1,1,1)), is(OverlapState.OUT));
	}
}
