package patterns;

public class pattern3 {
  public static void main(String[] args){
    int n = 5;
    for (int i=1 ; i<=n ; i++){
      for(int j=0 ; j<=n-i; j++){
        System.err.print("* ");
      }System.out.println();
    }
  }
}
