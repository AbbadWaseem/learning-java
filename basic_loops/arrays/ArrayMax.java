public class ArrayMax {
    public static void main(String[] args) {
      int[][] array = {
        { 19, 82, 95 },
        { 65, -81, 02 }
      };
      int maxium=array[0][0];
      int minion=array[0][0];
      for (int i=0;i<array.length;i++){
        for (int j=0;j<array[0].length;j++){
          System.out.print(array[i][j]+" ");
          if (array[i][j]>maxium){
            maxium=array[i][j];
          }
          if(array[i][j]<minion){
            minion=array[i][j];
          }
        }
        System.out.println();
      }
      System.out.println("Maxiumum number is "+maxium);
      System.out.println("Minimum number is "+minion);

      float aw=16.11f;
    }
}
