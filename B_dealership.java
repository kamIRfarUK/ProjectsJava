import java.util.Scanner;

public class B_dealership {
    //dealership cars can buy a car and sell one
    //add insurance licence and credit score
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println(" Welcome to Dealearship program!");
        System.out.println(" * Select option 'A' to buy a car");
        System.out.println(" * Select option 'B' to sell a car");
        //scanner to get values from user from terminal
        String option = scan.nextLine();

        switch (option){
            case "a":
                System.out.println("what is your current budget?" );
                int budget = scan.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is Available");
                    System.out.println("Do you have an insurance? (yes/no)");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("Do you have an License? (yes/no)");
                    String license = scan.nextLine();
                    System.out.println("What is your credit score?   ");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                        System.out.println("Sold!! Pleasure doing business with you.");
                    }else{
                        System.out.println("We are sorry. You are not elligible.");
                    }
                }else{
                    System.out.println("we don,t sell cars under 10,000. Sorry!");
                }
                break;
            case "b":
                System.out.println("What is your car value at?");
                int value = scan.nextInt();
                System.out.println("what is your selling price?");
                int price = scan.nextInt();
                if (value > price && price < 30000){
                    System.out.println("We will buy your car.");
                    System.out.println("Pleasure doing business with you!");
                }else{
                    System.out.println("Sorry, We arent interested.");
                }




                break;
            default: System.out.println("invalid option");
        }
        scan.close();


   }

}
