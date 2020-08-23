/* importing header files (libraries) */
import java.util.Scanner;

public class Simple-Calculator{

  private int num1;
  private int num2;
  
  public int sum(int a, int b){
    this.num1 = a;
    this.num2 = b;
    
    return (this.num1 + this.num2);
  }
  
  public int product(int a, int b){
    this.num1 = a;
    this.num2 = b;
    
    return (this.num1 * this.num2);
  }
  
  public static void main(String[] args){
       // call to sum function
       int total = sum(11, 20);
       System.out.println("The sum is: " + total);
    
      // call to product function
       int prod = product(22, 33);
       System.out.println("The product is: " + prod);
  }
}
