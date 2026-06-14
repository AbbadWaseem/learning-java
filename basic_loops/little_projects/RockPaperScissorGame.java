import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame{
  public static void main (String[] args){
    Scanner ck=new Scanner(System.in);
    Random tt=new Random();
    System.out.println("Enter a number from 0 to 11");
    int rr=tt.nextInt(0,12);
    int lk=ck.nextInt();
    int pp=0;    
    switch (rr) {
      case 7,0,1,2:
        pp=31;
        break;
      case 11,4,5,6:
        pp=32;
        break;
      case 3,8,9,10:
        pp=33;
        break;
      default:
        System.out.println("Dhang se lihk");    
    }
    int ww=0;
    switch (lk) {
      case 3,0,1,2:
        ww=31;
        break;
      case 7,4,5,6:
        ww=32;
        break;
      case 11,8,9,10:
        ww=33;
        break;
      default:
        System.out.println("Dhang se lihk");
        System.exit(0);
    }
    if (ww==pp){
      System.out.println("Tie");
    }
    else if (((ww-pp)==1) || ((ww-pp)==-2)){
      System.out.println("User won");
    }
    else {
      System.out.println("System won");
    }

    String syst="shutdown";
    switch(pp){
      case 31:
        syst="Rock";
        break;
      case 32:
        syst="Paper";
        break;
      case 33:
        syst="Scissor";
        break;  
    }
    String inpu="test";
    switch(ww){
      case 31:
        inpu="Rock";
        break;
      case 32:
        inpu="Paper";
        break;
      case 33:
        inpu="Scissor";
        break;  
    }
    System.out.printf("This was chosen by User : %s\nThis was chosen by System : %s%n",inpu,syst);
  }
}
