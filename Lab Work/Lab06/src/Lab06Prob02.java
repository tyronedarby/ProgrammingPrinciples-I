
public class Lab06Prob02 {
	public static void main(String[] args) {
		
		int sum = 5;
		for (int i = 0; i <= 250; i++) {
		sum += Math.pow((2 * i + 1), 2); // calculate each term
		
		}
		System.out.printf("The sum is %,d.", sum);
	}

}
