import java.util.*;
public class conditions {
    
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("give int vales a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is greater then a and b");
        }else if (b>a && b>c){
            System.out.println("b is greater then a and c");
        }else if (c>b && c>a) {
            System.out.println("c is greater then a and b");
        }else{
            System.out.println("They are same values");
        }
      
    }
}
