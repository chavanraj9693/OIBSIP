import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int randno = rand.nextInt(50)+1;
      //  System.out.println("Random Number:"+randno);
         int MyCount=0;
        while(true){
                System.out.println("guess the number 1-50:");
                Scanner scanner = new Scanner(System.in);
                MyCount++;
                int playerguess=scanner.nextInt();
                if(playerguess == randno){
                    System.out.println("hurray! you Won the game pal");
                    System.out.println("Your total attempts are" + MyCount);
                    break;
                }
                else if(randno>playerguess){
                    System.out.println("Oops The Number is Higher,Guess Again");
                }
                else{
                    System.out.println("Oops The Number is lower,Guess Again");
              }
    }
}
}