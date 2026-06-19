import java.util.Scanner;
public class ArraySum{
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    float []marks=new float[5];
    marks[0]=sc.nextFloat();
    marks[1]=sc.nextFloat();
    marks[2]=sc.nextFloat();
    marks[3]=sc.nextFloat();
    marks[4]=sc.nextFloat();
    Float sum=0f;
    for (Float elmnt:marks){
      sum=sum+elmnt;
    }
    System.out.println(sum);

  }
}
