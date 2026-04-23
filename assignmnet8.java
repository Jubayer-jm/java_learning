import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Have you completed your Masters? (y/n): ");
        char masters = input.next().charAt(0);

        System.out.print("Are you fluent in English? (y/n): ");
        char english = input.next().charAt(0);

        if ((masters == 'y' || masters == 'Y') && 
            (english == 'y' || english == 'Y')) {

            System.out.println("You are eligible for the job interview");
        } 
        else {
            System.out.println("Sorry, you are not eligible for the job interview");
        }

        input.close();
    }
}