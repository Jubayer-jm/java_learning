package BasicJava;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            int phonePrice=1800;

            int numberofIntallment;
            double instalmmentPerMonth;

            System.out.println("Number of installment: ");
            numberofIntallment=input.nextInt();

            instalmmentPerMonth=(double)phonePrice/numberofIntallment;

            System.out.println("Monthly intalment amount: "+ instalmmentPerMonth+"euros");
        }
    }
}
