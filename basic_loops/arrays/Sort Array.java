import java.util.Arrays;
public class Main{
  public static void main (String[] args){
    int [] arr={2,4,9,25,169};
    System.out.println(Arrays.toString(arr));
    for (int i=0;i<arr.length/2;i++){
      int temp=arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }
    System.out.println(Arrays.toString(arr));   
     
    float aw=16.11f;
  }
}
