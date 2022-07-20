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
	
	@Test
	public void checkOverlapにrとthisが同じ大きさの長方形を与えるとOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(4,4,4,4)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void checkOverlapにrがthisより小さい長方形を与えるとINを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,5,2,2)), is(OverlapState.IN));
	}
	
	@Test
	public void checkOverlapにrがthisの右の辺に重なるとOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,5,3,3)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void checkOverlapにrがthisの左の辺に重なるOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(3,3,2,2)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void checkOverlapにrがthisの上の辺に重なるOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,3,2,2)), is(OverlapState.OVERLAP));
	}

	@Test
	public void checkOverlapにrがthisの下の辺に重なるOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,7,2,2)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void checkOverlapにrがthisの外側の右斜め上にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(1,1,1,1)), is(OverlapState.OUT));
	}
}
