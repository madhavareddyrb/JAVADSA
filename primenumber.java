import java.util.Scanner;
public class primenumber {
  public static void main(String[] args){
    int num , count ;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the user number : ");
    num = sc.nextInt();
    count = 0;
    if(num>0){
      for (int i = 1 ; i<=num ; i++){
        if(num%i == 0){
          count++;
        }if(count == 2){
          System.out.println("prime number");
        }else{
          System.out.println("not a prime");
        }
        }
    }else{
      System.out.println("not a prime");
    }
    }
}
