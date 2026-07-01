import java.util.Arrays;
import java.util.Random;
public class MarksAvg{
  public static void main (String[] args){
    Random rn=new Random();
    int [] array=new int[20];
    for(int z=0;z<array.length;z++){
      array[z]=rn.nextInt(12,51);
    }
    System.out.println(Arrays.toString(array));
    int sum=0;
    for(int i=0;i<array.length;i++){
      sum=sum+array[i];
    }
    System.out.println("The average of students marks is "+sum/20);
    
    float aw=16.11f;
  }
}
