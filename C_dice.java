import java.net.StandardSocketOptions;
import java.util.Scanner;

public class C_dice {
    //Rules
    //· The user needs to pick three numbers(4 3 5)SUM: 12
    //. The user needs to roll the dice three times(3 4 4)SUM: 11
    //· The user wins if:
    //. The sum of dice rolls is smaller than the sum of numbers you chose
    //. AND the difference between the two numbers is less than threetrue
    //
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();


        System.out.println("Enter 3 numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if( num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cant be less than One!");
            System.exit(0);
        }
        if( num1 > 6 || num2 > 6 || num3 > 6 ){
            System.out.println("Numbers cant be more than Six!");
            System.exit(0);
        }
        System.out.println("Comp played " + roll1 +"," + roll2 +","+ roll3);

        int sumOfNumbers = num1+num2+num3;
        int sumOfDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice Sum = " + sumOfDiceRolls );
        System.out.println("Number Sum = " + sumOfNumbers );

        if( checkWin( sumOfNumbers , sumOfDiceRolls )){
            System.out.println("Congats! YOU WIN.");
        }else{
            System.out.println("You Lost!");
        }
        scan.close();
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber +=1;
        return (int)randomNumber;

    }

    public static boolean checkWin( int SumOfNumbers , int SumOfDiceRolls ){
        return( SumOfNumbers > SumOfDiceRolls && SumOfNumbers - SumOfDiceRolls < 3);

    }
}
