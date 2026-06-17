
import java.util.*;
public class Classwork3 {
  public static void main(String args[]) {
    int x=10;
    double y=25.0;
    String w="word";
    
    printValue(x);
    printValue(y);
    printValue(w);
    //printMessagesNTimes("Winning", 20);
    sumUserNegatives();
    //System.out.println("Sum of x+y = " + z);
  }
  
  public static void sumUserNegatives(){
      //System.out.println("Enter Num: ");
      Scanner input = new Scanner(System.in);
     int num = 0;
     int sum = 0;
      while(num != -99999){
          System.out.println("Enter Num: ");
          num = input.nextInt();
          if(num < 0 && num != -99999){
              sum += num;
          } 
      }
      System.out.println(sum);
      
  }
  
  public static void printMessagesNTimes(String msg, int n){
      if(n < 1){
        System.out.println("Error");  
      }
      
      for(int i =0; i<n; i++){
          System.out.println(msg);
      }
  }
  
  public static void printValue(int n){
      System.out.println(n);
  } 
  
  public static void printValue(double d){
      System.out.println(d);
  } 
  
  public static void printValue(String s){
      System.out.println(s);
  } 
}