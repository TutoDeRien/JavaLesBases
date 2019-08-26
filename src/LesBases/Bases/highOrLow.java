package LesBases.Bases;


import java.util.Random;
import java.util.Scanner;

public class highOrLow {

    public static void main(String[] args) {

        int findMe;
        Random random = new Random();
        findMe=random.nextInt(50)+1; //<---Create the random number and store it in findMe
        giveMeNumber(findMe); //<-- call the method giveMeNumber with findMe as parameter.
    }

    public static void giveMeNumber(int findMe){
        int guess;
        int counter=0;
        //start a loop that will continue to ask the user a number till the counter reach 4
        while (counter<4) {
            Scanner clavier = new Scanner(System.in);
            System.out.println("attempt: "+(counter+1)); //will show the numbers of attempts (the counter start at 0 so adding +1 will show 1)
            System.out.print("give a number between 1 and 50: ");
            guess = clavier.nextInt(); //load the user input into guess

            //checking if the guess number is > than the number that is store into findMe
            if (guess>findMe){
                System.out.println("you are too high");
            //checking if the guess number is < than the number that is store into findMe
            }else if(guess<findMe) {
                System.out.println("you are too low");
            //if the guess number is not > or < than the findMe number than the user guess the number of findMe
            }else {
                System.out.println("Yea you find the number that was: "+findMe);
                System.exit(0); //this code will exit the program.
            }

            counter++;//it the solution isn't found increase the counter by 1
        }
        //if attempt are >4 than show the message bellow
        System.out.println("You lose");
    }

}










