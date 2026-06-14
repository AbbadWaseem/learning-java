import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=1;
      System.out.printf("Multiplication Table of %d :\n",num1);
      while (num2<=10){
       int num3=num1*num2;
       System.out.printf("%d x %d = %d%n",num1,num2,num3);
       num2++;
      }
    }
}
