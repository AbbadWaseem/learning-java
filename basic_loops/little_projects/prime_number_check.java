import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner rc=new Scanner(System.in);
      int pr=rc.nextInt();
      if (pr<=1){
        System.out.println("Prime numbers are strictly defined as positive integers greater than 1.");
      }
      switch(pr){
        case 2:
        System.out.println("This is a prime number");
        break;
      }
      boolean isPrime=false;
      for(int i=2;i<pr;i++){
        if (pr%i==0){
          System.out.println("This is not a prime number");
          break;
        }
        else{
          isPrime=true;
        }
      }
      if (isPrime){
        System.out.println("This is a prime number");
      }
    }
}
