import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner rc=new Scanner(System.in);
      int pr=rc.nextInt();
      boolean isPrme=true;
      for(int i=2;i<pr;i++){
        if (pr%i==0){
          isPrme=false;
          break;
        }
      }
      if (pr<=1){
        System.out.println("Prime numbers are strictly defined as positive integers greater than 1.");
      }
      else if (isPrme){
        System.out.println("This is a prime number");
      }
      else {
        System.out.println("This is not a prime number");
      }
    }
}
