import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you love Java? (y/Y/n/N)");
        char choice = input.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            System.out.println("You are a Java lover");
        } 
        else if (choice == 'n' || choice == 'N') {
            System.out.println("You are not a Java lover");
        } 
        else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}