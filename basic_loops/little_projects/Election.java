//Future additions : account for tie ; vote perccentage calculate
//admin code = 15227
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Election {
    public static void main (String[] args){
        //Shuru
        Scanner sc= new Scanner(System.in);
        Random rd=new Random();

        //Variable define
        String [] candidate= {"Kej","Mod","Rah"};
        int [] usvote =new int[3];

        //Logic
        for (int j=0;j<candidate.length;j++) {
            System.out.printf("Press %d for %s%n",j+1,candidate[j]);
        }
        for (int i=0; i<=100;i++) {
            int vote=rd.nextInt(0,3);
            usvote[vote]++;
        }

        //Kuch variable Define
        int max=usvote[0];
        int maxindex=0;
        int min=usvote[0];
        int minindex=0;
        for (int l=0;l< usvote.length;l++){
            if (usvote[l]>max){
                max=usvote[l];
                maxindex=l;
            }
            if (usvote[l]<min){
                min=usvote[l];
                minindex=l;
            }
        }

        //FinalfPrint
        System.out.println("Enter admin code ");
        int code=sc.nextInt();
        if (code==15227){
            System.out.println("Welcome Admin\nFor result press 1\nFor exiting press 2");
            int adm=sc.nextInt();
            switch (adm){
                case 1-> {
                    System.out.println("Votes : ");
                    for (int k=0;k< candidate.length;k++){
                        System.out.println("    "+candidate[k]+" : "+usvote[k]);
                    }
                    System.out.printf( "Highest Votes : %d : %s %nLowest Votes : %d : %s%n",max,candidate[maxindex],min,candidate[minindex]);
                }
                case 2-> System.out.println();
                default-> System.out.println("Uhm wrong input");
            }
        }
        System.out.print("Thankyou for using my machine");

        float aw=16.11f;
    }
}