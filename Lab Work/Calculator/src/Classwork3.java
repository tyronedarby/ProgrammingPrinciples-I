
public class Classwork3 {

	public static void main(String[] args) {
		int tuition = 10000;
		int year = 0;
		int tTuition = 2*tuition;
		double rate = 1.07;
		
		while(tuition <= tTuition) {
			tuition *= rate;
			year++;
		}
		System.out.println(year);
	}

}
