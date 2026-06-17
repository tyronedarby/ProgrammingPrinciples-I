
public class ClassWork {
	public static void main(String args[]) {
	   int startNum = 1, endNum =30;
	   int product = 1;
	 /*   while(startNum <= endNum){
	    System.out.println(startNum);
	    startNum++;
	  }*/
		while(startNum < endNum) {
			product *= startNum;
			System.out.printf("Product %,d%n", product);
			startNum++;
		}

	}
}
