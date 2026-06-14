//Will add "How many attempts left" after every turn in future
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Random rn=new Random();
      Scanner sn=new Scanner(System.in);
      
      int rd=rn.nextInt(1,101);
      boolean uGsd=false;
 
      for (int p=-11;p<=-5;p++){
        System.out.println("Please enter a number between 1-100 :");
        int in=sn.nextInt();
        if (in==rd){
          System.out.println("You nailed it that's right");
          uGsd=true;
          break;
        }
        else if (in<rd){
          System.out.println("You need to enter a higher number");
        }
        else {
          System.out.println("Not that high mate");
        }
      }

      if (uGsd){
        System.out.println("Congratulations mate you guessed it right");
      }
      else {
        System.out.printf("You failed no problem btw this was the number : %d",rd);
      }
 
    }
}
