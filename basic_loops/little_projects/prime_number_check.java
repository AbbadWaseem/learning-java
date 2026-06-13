import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner rc=new Scanner(System.in);
      
      int pr=rc.nextInt();
      boolean isPrme=true;

      if (pr<=1){
        System.out.println("Prime numbers are strictly defined as positive integers greater than 1.");
        isPrme=false;
      }

      for(int i=2;i<pr;i++){
        if (pr%i==0){
          isPrme=false;
          System.out.println("This is not a prime number");
          break;
        }
      }

      if (isPrme){
        System.out.println("This is a prime number");
      }
    }
}
