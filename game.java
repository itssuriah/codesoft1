import java.util.Random;
import java.util.Scanner;

public class game {
    public int gameply() {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int rans = ran.nextInt(100) + 1;
        int count = 10;
        int att = 10;
        while (true) {
            System.out.println("Enter Your Number :");
            int guess = sc.nextInt();
            count--;
            att--;
            if (rans == guess) {
                System.out.println("Correct! You Got it!!");
                System.out.println("Your Score is " + count + " !");
                break;
            } else if (rans > guess) {
                System.out.println("Nope ! , The number is Higher!! Try again:");
                System.out.println("You have Remain " + att + " attempt");
            } else {
                System.out.println("Nope ! , The number is Lower!! Try again:");
                System.out.println("You have Remain " + att + " attempt");
            }

        }
        sc.close();
        return count;
    }

}