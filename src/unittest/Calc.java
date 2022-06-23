package unittest;

public class Calc {	
	int add(int x, int y) {
		return x + y;
	}

	int multiply(int x, int y) {
		return x * y;
	}	

	int abs(int x) {
		if (x < 0)
			return -x;
		else
			return x;
	}
}
