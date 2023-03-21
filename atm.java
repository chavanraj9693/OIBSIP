

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        
    
    int balance=1000, withdraw=0,deposit;
    Scanner sc= new Scanner(System.in);

    while(true){


        System.out.println("Welcome");
        System.out.println("1: For withdraw");
        System.out.println("2: For Check Balance");
        System.out.println("3: For Deposit");
        System.out.println("4: For Exit");
        System.out.println("choose the process you want");
        int n =sc.nextInt();
        switch(n) {
            case 1:
            System.out.println(":Enter the amount to Withdraw:");
            if(balance>=withdraw){
            balance=balance- withdraw;
            System.out.println("collect the amount");
        }
        else{
            System.out.println("insufficient balance");

        }
        System.out.println(" ");
        break;

        case 2:
        System.out.println("Your current account balance is:"+balance);
        System.out.println(" ");
        break;

        case 3:
        System.out.println("Enter the amount to deposit:");
        deposit=sc.nextInt();
        balance=balance+deposit;
        System.out.println("Money suceessfully deposited");
        System.out.println(" ");
        break;

        case 4:
        System.exit(0);


    }
}
}           
}
