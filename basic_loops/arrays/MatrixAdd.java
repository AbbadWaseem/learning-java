public class MatrixAdd{
  public static void main (String[] args){
    int[][] matric = {{1, 2, 4}, {2, 4, 8}};
    int[][] array = {{1, 3, 5}, {3, 6, 11}};
    int[][] sum=new int[2][3];
    for (int i=0;i<array.length;i++){
      for (int j=0;j<array[0].length;j++){
        System.out.print(array[i][j]+" ");
      }
      System.out.println("");
    }
    System.out.println();
    for (int i=0;i<matric.length;i++){
      for (int j=0;j<matric[0].length;j++){
        System.out.print(matric[i][j]+" ");
      }
      System.out.println("");
    }
    System.out.println();
    for (int i=0;i<sum.length;i++){
      for (int j=0;j<sum[0].length;j++){
        sum[i][j]=matric[i][j]+array[i][j];
        System.out.print(sum[i][j]+" ");
      }
      System.out.println("");
    }

    float aw=16.11f;
  }
}
