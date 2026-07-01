import java.util.Arrays;
public class ReverseArray{
  public static void main (String[] args){
    int [] arr={2,4,9,25,169};
    System.out.println("This is your current array\n"+Arrays.toString(arr));
    for (int i=0;i<arr.length/2;i++){
      int temp=arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }
    System.out.println("\nThis is your reversed array\n"+Arrays.toString(arr));   
     
    float aw=16.11f;
  }
}
