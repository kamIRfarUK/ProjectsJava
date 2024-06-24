

import java.util.Scanner;
public class D_rockPaperScissor {
    //see if the user wants to play
    //Set up the game




    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets play ROCK / PAPER / SCISSORS");
        System.out.println("Are you ready?(yes/no)");

        String ready = scan.nextLine();
        if(ready.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("rock -- paper -- scissor, shoot!");
            String choice = scan.nextLine();

            //get the computer choice (can only be done after task 3).
            String compChoice = computerChoice();

            String result = result( choice, compChoice);
            printResult( choice, compChoice, result);
        }else{
            System.out.println("\nOK! some other time.");
        }
        scan.close();



    }

    //Task 3 - Write a function where the computer picks a random choice.
    //    * Function name: computerChoice .
    //picks randomly between rock paper and scissors return a choice (String).
    //    * Inside the function:
    //        1. Picks a random number between 0 and 2.
    //        2. if 0: returns the choice 'rock'
    //        if 1: returns the choice 'paper'
    //        if 2: returns the choice 'scissors'
    public static String computerChoice(){
        double randomNumber = Math.random() * 3;  //0-2.9999
        int integer = (int)randomNumber;          //0-2

        switch (integer){
            case 0 : return "rock";
            case 1 : return "paper";
            case 2 : return "scissor";
            default : return "";
        }
    }


    //Task 4 - Write a function that compares the choices and returns the result
    //        * Function name: result - It returns the result of the game.
    //*@param yourChoice (String)
    //*@param computerChoice (String)
    //*@return result (String)


    //* Inside the function:
    //        1. result is "You win" if :
    //            You: "rock"           Computer: 'scissors"
    //            You: "paper"          Computer: "rock"
    //            You: "scissors"       Computer: "paper"

    //
    //        2. result is "You lose" if :
    //            Computer: "rock"      You: "scissors"
    //            Computer: "paper"     You: "rock"
    //            Computer: "scissors"  You: "paper"

    //        3. result is "It's a tie" if:
    //             your choice equals computer choice.



    public static String result(String YourChoice, String CompChoice) {
        //get the result (can only be done after task 4)
        String result ="";

        if(YourChoice.equals("rock") && CompChoice.equals("scissor")){
            result = "You Win!!";
        } else if ( CompChoice.equals("rock") && YourChoice.equals("scissor")) {
            result = "You Lose!!";
        } else if(YourChoice.equals("paper") && CompChoice.equals("rock")){
            result = "You Win!!";
        } else if ( CompChoice.equals("paper") && YourChoice.equals("rock")) {
            result = "You Lose!!";
        } else if(YourChoice.equals("scissor") && CompChoice.equals("paper")){
            result = "You Win!!";
        } else if ( CompChoice.equals("scissor") && YourChoice.equals("paper")) {
            result = "You Lose!!";
        }else{
            result = "its a Tie!";
        }
        return result;
    }


    public static void printResult( String YourChoice, String CompChoice, String Result){
        //print everything (can only be done after task 5).
        System.out.println("\nYou chose:\t" + YourChoice );
        System.out.println("\nComp chose:\t" + CompChoice);
        System.out.println(Result);
    }
}
