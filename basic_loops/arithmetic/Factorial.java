//This program currently can't calculate the factorial for numbers greater than 19 because of computational limitations of primitive datatypes
//In future will add Big Integer class to overcome this limitation

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sr=new Scanner(System.in);
      int a=sr.nextInt();
      int fac=1;
      if (a<0){
        System.out.printf("Factorial is a mathematical function which don't work on negative integers");
      }
      else{
        for(int i=2; i<=a;i++){
        fac=fac*i;
        }
        System.out.printf("Factorial of %d is : %d",a,fac);
      }
    }
  }
