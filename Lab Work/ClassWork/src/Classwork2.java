
public class Classwork2 {
	public static void main(String[] args) {
	  int product = 0;
	  	//Outer loop
	    for(int i = 5; i <= 25; i+=5){
	        System.out.printf("\n%d: ", i);
	        //Inner loop
	        for(int j = 1; j <= i; j++){
	            if(i % j == 0){
	                System.out.printf("%d ", j);
	            }
	            //product *= j;
	        }
	    }

	    System.out.println();
	}
}