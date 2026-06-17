public class Classwork4 {
  public static void main(String[] args) {
    int[] randNum = new int[10];
    
    
    int avg = 0, sum = 0, max = -1, min = 1001;
    for(int i = 0; i < randNum.length; i++){
        randNum[i] = (int) (Math.random() * 1001);
        sum += randNum[i];
        avg = sum / randNum.length;
        
        if(randNum[i] > max){
            max = randNum[i];
        }
        
        if(randNum[i] < min){
            min = randNum[i];
        }
    }
    
    System.out.println("Average is " + avg);
    System.out.println("Sum is " + sum);
    System.out.println("Max is " + max);
    System.out.println("Min is " + min);
    
   for(int i = 0; i < randNum.length; i++){
        System.out.println(randNum[i]);        
    }
  }
}