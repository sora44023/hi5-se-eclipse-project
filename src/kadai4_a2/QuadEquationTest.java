package kadai4_a2;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class QuadEquationTest {
	private QuadEquation qe;

	@Before
	public void setUp() throws Exception {
		qe = new QuadEquation();
	}

	@Test
	public void getSolutionに2と8と1を与えるとREALを返す() {
		assertThat(qe.getSolution(2, 8, 1), is(QuadEquation.SolutionType.REAL));
	}

	@Test
	public void getSolutionに2とマイナス8と1を与えるとREALを返す() {
		assertThat(qe.getSolution(2, -8, 1), is(QuadEquation.SolutionType.REAL));
	}

	@Test
	public void getSolutionに1とマイナス5と0を与えるとREALを返す() {
		assertThat(qe.getSolution(1, -5, 0), is(QuadEquation.SolutionType.REAL));
	}

	@Test
	public void getSolutionに1と1と1を与えるとCOMPLEXを返す() {
		assertThat(qe.getSolution(1, 1, 1), is(QuadEquation.SolutionType.COMPLEX));
	}

	@Test
	public void getSolutionに1と2と1を与えるとCOMPLEXを返す() {
		assertThat(qe.getSolution(1, 2, 1), is(QuadEquation.SolutionType.DOUBLE));
	}

	@Test
	public void getSolutionにと0と2と3を与えるとREALを返す() {
		assertThat(qe.getSolution(0, 2, 3), is(QuadEquation.SolutionType.LINEAR));
	}

	@Test
	public void getSolutionにと0と0と1を与えるとREALを返す() {
		assertThat(qe.getSolution(0, 0, 1), is(QuadEquation.SolutionType.NONE));
	}

	@Test
	public void getSolutionにと0を与えるとREALを返す() {
		assertThat(qe.getSolution(0, 0, 0), is(QuadEquation.SolutionType.INDEF));
	}

}
