package recursion;

public class FibonacchiNo {

	public static int fibonacchi(int n) {
		if(n<=1) return n;
		int last = fibonacchi(n-1);
		int slast = fibonacchi(n-2);
		return last+slast;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacchi(4));

	}

}
