import java.util.Scanner;

public class PyramidPatternGenerator {
    public static void main(String[] args) {
      System.out.println("Random pyramid generator");
      Scanner rn=new Scanner(System.in);
      int random=rn.nextInt();
      System.out.println("Please choose an option");
      int a=rn.nextInt();
      switch (a){
       case 1 :
          for (int i=random;i>=0;i--){
            System.out.println("*".repeat(i));
          }
          break;

        case 2:
          for (int i=1;i<=random;i++){
            System.out.println("*".repeat(i));
          }
          break;
    //Yaha par case 3 edit karna hai ek new pattern banana hai
        case 3:
          for (int i=random;i>=0;i--){
              System.out.println("*".repeat(i));
            }
          break;

        default :
          System.out.println("Please choose the correct option");
      }
      
    }
}
