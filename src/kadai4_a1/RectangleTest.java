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
	public void rがthisより小さいときINを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,5,2,2)), is(OverlapState.IN));
	}
	
	@Test
	public void rとthisが同じ大きさであるときOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(4,4,4,4)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void rがthisの外側にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,1,2,2)), is(OverlapState.OUT));
	}
	
	@Test
	public void rがthisの右の辺に重なるとOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,5,3,3)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void rがthisの左の辺に重なるOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(3,3,2,2)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void rがthisの上の辺に重なるOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,3,2,2)), is(OverlapState.OVERLAP));
	}

	@Test
	public void rがthisの下の辺に重なるOVERLAPを返す() {
		assertThat(r.checkOverlap(new Rectangle(5,7,2,2)), is(OverlapState.OVERLAP));
	}
	
	@Test
	public void rがthisの左外側にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(1,1,10,2)), is(OverlapState.OUT));
	}
	
	@Test
	public void rがthisの右外側にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(9,2,2,10)), is(OverlapState.OUT));
	}
	
	@Test
	public void rがthisの上外側にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(1,2,10,2)), is(OverlapState.OUT));
	}
	
	@Test
	public void rがthisの下外側にあるときOUTを返す() {
		assertThat(r.checkOverlap(new Rectangle(3,5,10,10)), is(OverlapState.OUT));
	}
}
