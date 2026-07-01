import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class NumCheck{
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    Random rn=new Random();
    int [] array=new int[50];
    for(int z=0;z<array.length;z++){
      array[z]=rn.nextInt(1,200);
    }
    System.out.println(Arrays.toString(array));
    System.out.println("Enter a number to search :");
    int target = sc.nextInt();
    int a=-1;
    boolean find=false;
    for (int i=0;i<array.length;i++){
      if (target==array[i]){
        find=true;
        a=i;
        break;        
      }
    }
    System.out.println(find? "Yes the number is present in the array at index "+a:"No the number is not present in the array");

    float aw=16.11f;
  }
}
