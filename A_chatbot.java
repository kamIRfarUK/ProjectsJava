import java.util.Scanner;

public class A_chatbot {
    public static void main(String[] args){
        //setup scanner
        Scanner scan = new Scanner (System.in);

        System.out.println("hello !! what is your name?");
        //pick up user's name and store it
        String name = scan.nextLine();

        System.out.println("hi" + name + "!, i am kamibot. where aare you from?");
        //pick up user's home and store it
        String home = scan.nextLine();

        System.out.println("i hear its beaautiful at" + home + "! i,am from a place called Cognizant!");
        System.out.println("how old are you?");
        //pick up user's age and store it
        int age = scan.nextInt();

        System.out.println("So you are " + age + ", cool, i am 400 years olderr than you");
        System.out.println("this means i am " + (400/age) + "times older than you.");
        System.out.println(" what is your favourite language?");


        scan.nextLine();
        String language = scan.nextLine();
        // if u put nextLine ahead of nextInt or nextDouble
        // in a way nextLine is going to be skipped. to prevent this,
        // so use throwaway nextLine i.e. scan.nextLine();
        // before the real nextLine

        System.out.println( language + "thats great!! Nice Chatting with you" + name + "i have to log off now ! see yall");
    }
}
