import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
      int[][] array = {
        { 19, 82, 95 },
        { 65, -81, 02 }
      };
      int maxium=array[0][0];
      boolean test=false;
      for (int i=0;i<array.length;i++){
        for (int j=0;j<array[0].length;j++){
          System.out.print(array[i][j]+" ");
          if (array[i][j]>maxium){
            test=true;
            maxium=array[i][j];
          }
        }
        System.out.println();
      }
      System.out.println(test? "Yes there is maximum number "+maxium : "Maxiumum number is "+maxium);
 
      float aw=16.11f;
    }
}
