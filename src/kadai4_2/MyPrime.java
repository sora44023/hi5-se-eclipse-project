package kadai4_2;

public class MyPrime {
	boolean isPrime(int n) {
		int i;

		if (n < 2)
			return false;
		else if (n == 2)
			return true;

		if (n % 2 == 0)
			return false;

		i = 3;
		while (true) {
			if (i > n / i)
				break;
			else if (n % i == 0)
				return false;
			i += 2;
		}
		return true;
	}
}
